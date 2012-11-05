
public class Variable extends Expression {
	private String variable;
	private int value;
	
	public Variable(String variable, int value) {
		this.variable = variable;
		this.value = value;
	}

	@Override
	public String toString() {
		return variable;
	}

	@Override
	public int operate(int a, int b) {
		return value;
	}
}
