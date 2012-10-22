
public class Addition extends Operation {
	
	public Addition() {
		setOperation('+');
	}

	@Override
	public int evaluate() {
		return getLeftComponent().evaluate() + getRightComponent().evaluate();
	}

}
