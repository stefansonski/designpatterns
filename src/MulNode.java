
public class MulNode extends Node {

	public MulNode() {
		setOperation('*');
	}

	@Override
	public int evaluate() {
		return getLeftComponent().evaluate() * getRightComponent().evaluate();
	}
	
}
