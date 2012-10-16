
public class SubNode extends Node {

	public SubNode() {
		setOperation('-');
	}

	@Override
	public int evaluate() {
		return getLeftComponent().evaluate() - getRightComponent().evaluate();
	}
	
}
