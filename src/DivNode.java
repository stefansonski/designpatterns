
public class DivNode extends Node {

	public DivNode() {
		setOperation('/');
	}

	@Override
	public int evaluate() {
		int right = getRightComponent().evaluate();
		
		if(right != 0)
			return getLeftComponent().evaluate() / getRightComponent().evaluate();
		else
			return 0;
	}
	
}
