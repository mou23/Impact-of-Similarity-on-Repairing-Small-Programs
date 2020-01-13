import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.jdt.core.dom.ASTNode;

public class FaultyNode extends Node {
	double suspiciousValue;
	
	public FaultyNode() {
		this.genealogy = null;
		this.tokens = null;
	}
	
	@Override
	public String toString() {
		return "FaultyNode [node=" + node + ", suspiciousValue=" + suspiciousValue + ", startLine=" + startLine
				+ ", endLine=" + endLine + ", type=" + type + "]";
	}	
}
