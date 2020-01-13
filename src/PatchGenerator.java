import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import org.apache.commons.io.FileUtils;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.BooleanLiteral;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ConditionalExpression;
import org.eclipse.jdt.core.dom.IBinding;
import org.eclipse.jdt.core.dom.InfixExpression;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.QualifiedName;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jface.text.Document;
import org.eclipse.text.edits.TextEdit;


public class PatchGenerator {
	private static PatchGenerator patchGenerator;
	CompilationUnit compilationUnit;
	int correctPatches;
//	static HashSet<CandidatePatch> candidatePatchesSet = new HashSet<CandidatePatch>();
	ArrayList<CandidatePatch> candidatePatchesList = new ArrayList<CandidatePatch>();
	Document document;
	File file;
	int count;
	File candidatePatchesDirectory;
//	boolean correctPatchFound;
//	long startingTime;
	IngredientCollector ingredientCollector;
	
	PatchEvaluator patchEvaluator;
	
	private PatchGenerator() {
		this.patchEvaluator = PatchEvaluator.createPatchEvaluator();
		this.ingredientCollector = IngredientCollector.createIngredientCollector();
	}
	
	public static PatchGenerator createPatchGenerator() {
		if(patchGenerator == null){
			patchGenerator = new PatchGenerator();
		}

		return patchGenerator;
	}
	
	void generatePatch(File file) {
		Program program = Program.createProgram();
//		this.startingTime = startingTime;
		this.init(file.getName());
		//	file = new File("digit003/src/main/java/introclassJava/digits_6e464f2b_003_old.java"); // //D:/thesis/software repair/resources/20/capgen/CapGen/IntroClassJava/dataset/syllables/fcf701e8bed9c75a4cc52a990a577eb0204d7aadf138a4cad08726a847d66e77126f95f06f839ec9224b7e8a887b873fe0d4b6f4311b4e8bd2a36e5028d1feca/002/src/main/java/introclassJava/syllables_fcf701e8_002.java
		this.file = file;

		ASTParser parser = ASTParser.newParser(AST.JLS12);
		String fileContent = readFileToString(file.getAbsolutePath());
		this.document = new Document(fileContent);
		parser.setSource(document.get().toCharArray());
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		parser.setResolveBindings(true);
		parser.setBindingsRecovery(true);
		parser.setStatementsRecovery(true);
		parser.setEnvironment(new String[] {program.sourceClassFilesDirectory}, null, null, true);
		parser.setUnitName(file.getName());
		this.compilationUnit = (CompilationUnit) parser.createAST(null);
//		System.out.println("Collecting Fixing Ingredients");
		
//		Tokenizer tokenizer = Tokenizer.createTokenizer();
//		tokenizer.tokenize(file.getAbsolutePath());
//		this.compilationUnit.accept(new VariableCollector());
//		System.out.println("DONE");
		this.compilationUnit.accept(ingredientCollector);
//		System.out.println("INGREDIENT");
//		System.out.println(IngredientCollector.fixingIngredients.size());
//		for(int i=0; i<IngredientCollector.fixingIngredients.size(); i++) {
//			System.out.println(IngredientCollector.fixingIngredients.get(i));
//		}
		//			System.out.println(IngredientCollector.faultyNodes.size());
		//		
//		System.out.println("VARIABLES");
//		for(int i=0; i<VariableCollector.variables.size(); i++) {
//			System.out.println(VariableCollector.variables.get(i));
//		}
		ReplaceHandler replaceHandler = ReplaceHandler.createReplaceHandler();
		for(int i=0; i<this.ingredientCollector.faultyNodes.size(); i++) {
			FaultyNode faultyNode = this.ingredientCollector.faultyNodes.get(i);
			replaceHandler.replace(faultyNode);
		}
		
		for(int i=this.count; i<patchGenerator.candidatePatchesList.size(); i++) { //candidatePatches.size()
 			this.document = new Document(fileContent);
 			CompilationUnit compilationUnitCopy = (CompilationUnit)ASTNode.copySubtree(compilationUnit.getAST(), compilationUnit);

 			ASTRewrite rewriter = ASTRewrite.create(compilationUnitCopy.getAST()); //compilationUnit.getAST();
 			//				System.out.println("AST REWRITER");
 			this.generateConcretePatch(rewriter, candidatePatchesList.get(i));			
		}
		this.count = patchGenerator.candidatePatchesList.size();
	}
	
	
	
	private void init(String filename) {
		Tokenizer.stringTokenPairList.clear();
//		this.count = 0;
//		this.correctPatches = 0;
//		this.candidatePatchesList.clear();
//		VariableCollector.variables.clear();
		this.ingredientCollector.filename = filename;
		this.ingredientCollector.faultyNodes.clear();
		this.ingredientCollector.fixingIngredients.clear();
	}

	public String readFileToString(String filePath) {
		StringBuilder fileData = new StringBuilder(100000);
		try{		
			BufferedReader reader = new BufferedReader(new FileReader(filePath));

			char[] buffer = new char[10];
			int numRead = 0;
			while ((numRead = reader.read(buffer)) != -1) {
				String readData = String.valueOf(buffer, 0, numRead);
				fileData.append(readData);
				buffer = new char[1024];
			}

			reader.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

		return  fileData.toString();	
	}

//	public void generatePatchTemplate(FaultyNode faultyNode) {
//		ReplaceHandler replaceHandler = ReplaceHandler.createReplaceHandler();
//		if(faultyNode.type.equals("SIMPLE_NAME")) {
//			// System.out.println("SIMPLE_NAME");
//			SimpleName simpleName = (SimpleName) faultyNode.node;
//			IBinding binding = simpleName.resolveTypeBinding();
//			if(binding == null) {
//				return;
//			}
//			replaceHandler.replace(binding, faultyNode, 0.1721);
//		}
//
//		else if(faultyNode.type.equals("STRING_LITERAL")) {
//			// System.out.println("STRING_LITERAL");
//			StringLiteral stringLiteral = (StringLiteral) faultyNode.node;
//			IBinding binding = stringLiteral.resolveTypeBinding();
//			if(binding == null) {
//				return;
//			}
//			replaceHandler.replace(binding, faultyNode, 0.1310);
//		}
//
//		else if(faultyNode.type.equals("INFIX_EXPRESSION")) {
//			//			System.out.println("INFIX_EXPRESSION " + faultyNode);
////			DeleteHandler.deleteUnderInfixExpression(faultyNode);
//			InfixExpression infixExpression = (InfixExpression) faultyNode.node;
//			IBinding binding = infixExpression.resolveTypeBinding();
//			if(binding == null) {
//				return;
//			}
//
//			replaceHandler.replace(binding, faultyNode, 0.0201);
//		}
//
//		else if(faultyNode.type.equals("QUALIFIED_NAME")) {
//			// System.out.println("QUALIFIED_NAME");
//			QualifiedName qualifiedName = (QualifiedName) faultyNode.node;
//			IBinding binding = qualifiedName.resolveTypeBinding();
//			if(binding == null) {
//				return;
//			}
//
//			replaceHandler.replace(binding, faultyNode, 0.0197);
//		}
//
//		else if(faultyNode.type.equals("CONDITIONAL_EXPRESSION")) {
//			// System.out.println("CONDITIONAL_EXPRESSION");
//			ConditionalExpression conditionalExpression = (ConditionalExpression) faultyNode.node;
//			IBinding binding = conditionalExpression.resolveTypeBinding();
//			if(binding == null) {
//				return;
//			}
//
//			replaceHandler.replace(binding, faultyNode, 0.0135);
//		}
//
//		else if(faultyNode.type.equals("SIMPLE_TYPE")) {
//			// System.out.println("SIMPLE_TYPE");
//			SimpleType simpleType = (SimpleType) faultyNode.node;
//			IBinding binding = simpleType.resolveBinding();
//			if(binding == null) {
//				return;
//			}
//
//			replaceHandler.replace(binding, faultyNode, 0.0082);
//		}
//
//		else if(faultyNode.type.equals("BOOLEAN_LITERAL")) {
//			// System.out.println("BOOLEAN_LITERAL");
//			BooleanLiteral booleanLiteral = (BooleanLiteral) faultyNode.node;
//			IBinding binding = booleanLiteral.resolveTypeBinding();
//			if(binding == null) {
//				return;
//			}
//
//			replaceHandler.replace(binding, faultyNode, 0.0075);
//		}
//		//		
//		else if(faultyNode.type.equals("PARAMETERIZED_TYPE")) {
//			// System.out.println("PARAMETERIZED_TYPE");
//			ParameterizedType parameterizedType = (ParameterizedType) faultyNode.node;
//			IBinding binding = parameterizedType.resolveBinding();
//			if(binding == null) {
//				return;
//			}
//
//			replaceHandler.replace(binding, faultyNode, 0.0038);
//		}
//		//		
//		else if(faultyNode.type.equals("PRIMITIVE_TYPE")) {
//			// System.out.println("PRIMITIVE_TYPE");
//			PrimitiveType primitiveType = (PrimitiveType) faultyNode.node;
//			IBinding binding = primitiveType.resolveBinding();
//			if(binding == null) {
//				return;
//			}
//
//			replaceHandler.replace(binding, faultyNode, 0.0009);
//		}
//		//		
//		else if(faultyNode.type.equals("ASSIGNMENT")) {
//			// System.out.println("ASSIGNMENT");
//			Assignment assignment = (Assignment) faultyNode.node;
//			IBinding binding = assignment.resolveTypeBinding();
//			if(binding == null) {
//				return;
//			}
//
//			replaceHandler.replace(binding, faultyNode, 0.0003);
//		}
//
//		else if(faultyNode.type.equals("METHOD_DECLARATION")) {
//			// System.out.println("METHOD_DECLARATION");
////			InsertHandler.insertUnderMethodDeclaration(faultyNode);
////			DeleteHandler.deleteUnderMethodDeclaration(faultyNode, 0.0157);
//		}
//
//		else if(faultyNode.type.equals("METHOD_INVOCATION")) {
//			// System.out.println("METHOD_INVOCATION");
//			//			InsertHandler.insert("SIMPLE_NAME", faultyNode, 0.0313);
//			//
////			InsertHandler.insertUnderMethodInvocation(faultyNode);
//			//
//			//			InsertHandler.insert("INFIX_EXPRESSION", faultyNode, 0.0125);
//			//
//			//			InsertHandler.insert("QUALIFIED_NAME", faultyNode, 0.0075);
//			//
//			//			InsertHandler.insert("BOOLEAN_LITERAL", faultyNode, 0.0047);
//		}
//
//		else if(faultyNode.type.equals("IF_STATEMENT")) {
//			// System.out.println("IF_STATEMENT");
////			InsertHandler.insertUnderIfStatement(faultyNode);
////			DeleteHandler.deleteUnderIfStatement(faultyNode);
//		}
//
//		else if(faultyNode.type.equals("TRY_STATEMENT")) {
//			// System.out.println("TRY_STATEMENT");
////			InsertHandler.insertUnderTryStatement(faultyNode);
//		}
//
//		else if(faultyNode.type.equals("CATCH_CLAUSE")) {
////			DeleteHandler.deleteUnderCatchClause(faultyNode, 0.0031);
//		}
//	}


	private void generateConcretePatch(ASTRewrite rewriter, CandidatePatch candidatePatch) {
		try{
			if(candidatePatch.mutationOperation.equals("replace")) {
				//				if(candidatePatch.fixingIngredient.toString().equals("i.value != 0")) {
				//					if(candidatePatch.faultyNode.toString().equals("n.value == 0")) {
				//						System.out.println("PERECHI!!!");
				//						System.out.println(count);
				//					}
				//				}
				//				System.out.println(candidatePatch.faultyNode+ " "+compilationUnit.getLineNumber(candidatePatch.faultyNode.getStartPosition()));
				//				System.out.println(candidatePatch.fixingIngredient+ " "+compilationUnit.getLineNumber(candidatePatch.fixingIngredient.getStartPosition()));
				rewriter.replace(candidatePatch.faultyNode, candidatePatch.fixingIngredient, null);
			}

			TextEdit edits = rewriter.rewriteAST(document,null);
			edits.apply(document);
			//			System.out.println(document.get());
//			(new File("mutants/"+file.getParent()+"/"+count+"/")).mkdirs();
			
			candidatePatchesDirectory = new File("mutants/"+(file.getParentFile()).getParent());
			File mutantDirectory = new File("mutants/"+(file.getParentFile()).getParent()+"/"+candidatePatch.initialRank); 
			mutantDirectory.mkdirs();
			Program program = Program.createProgram();
			FileUtils.copyDirectory(new File(program.sourceFilesDirectory), mutantDirectory);
			generateProgramVariant(new File(mutantDirectory+"/"+file.getName()));
//			System.out.println("File no: "+this.count);
//			System.out.println("Program variant ready!");
//			if(this.compiler.compileProject(mutantFile.getAbsolutePath(), "output") == true) { //file.getAbsolutePath(),Program.sourceClassFilesDirectory
//				correctPatchFound = this.patchEvaluator.evaluatePatch();
//				if(correctPatchFound == true) {
//					System.out.println("Correct Patch Generated!");//+ " Elapsed Time: " +(System.nanoTime()-startingTime));
//					System.out.println("File no " +count);
//					System.out.println(candidatePatch.faultyNode);
//					System.out.println(candidatePatch.fixingIngredient);
////					System.out.println(candidatePatch.mutationOperation);
//				}
//				else {
//					deleteDirectory(new File("mutants/"+file.getParent()+"/"+count));
//				}
//			}
//			else {
//				deleteDirectory(new File("mutants/"+file.getParent()+"/"+count));
//			}
//			this.count++;
			
		} catch(Exception e) {
//			System.out.println("ERROR!!!!!!!!!!!!!!!!!!!");
			
//			System.out.println(candidatePatch.faultyNode+ " "+compilationUnit.getLineNumber(candidatePatch.faultyNode.getStartPosition()));
//			System.out.println(candidatePatch.fixingIngredient+ " "+compilationUnit.getLineNumber(candidatePatch.fixingIngredient.getStartPosition()));
//						System.out.println(ModelExtractor.getNodeType(candidatePatch.faultyNode));
//						System.out.println(ModelExtractor.getNodeType(candidatePatch.fixingIngredient));
//			System.out.println(e.getMessage());
			//			e.printStackTrace();
		} catch(StackOverflowError overflow) {
//			System.out.println("OVERFLOW!!!!!!!!!!!!!!!!");
//			System.out.println(candidatePatch.faultyNode+ " "+compilationUnit.getLineNumber(candidatePatch.faultyNode.getStartPosition()));
//			System.out.println(candidatePatch.fixingIngredient+ " "+compilationUnit.getLineNumber(candidatePatch.fixingIngredient.getStartPosition()));
//						System.out.println(ModelExtractor.getNodeType(candidatePatch.faultyNode));
//						System.out.println(ModelExtractor.getNodeType(candidatePatch.fixingIngredient));
//			System.out.println(overflow.getMessage());
//						System.out.println();
		}
	}
	
	

	void generateProgramVariant(File file) {
		try {
			FileWriter fileWrite = new FileWriter(file.getAbsolutePath());
			fileWrite.write(document.get());
			fileWrite.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
