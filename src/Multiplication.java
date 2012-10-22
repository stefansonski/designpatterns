
public class Multiplication extends Operation {

	public Multiplication() {
		setOperation('*');
	}

	@Override
	public int evaluate() {
		return getLeftComponent().evaluate() * getRightComponent().evaluate();
	}
	
}
