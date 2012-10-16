
public class AddNode extends Node {
	
	public AddNode() {
		setOperation('+');
	}

	@Override
	public int evaluate() {
		return getLeftComponent().evaluate() + getRightComponent().evaluate();
	}

}
