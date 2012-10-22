
public class Division extends Operation {

	public Division() {
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
