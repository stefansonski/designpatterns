
public class Subtraction extends Operation {

	public Subtraction() {
		setOperation('-');
	}

	@Override
	public int evaluate() {
		return getLeftComponent().evaluate() - getRightComponent().evaluate();
	}
	
}
