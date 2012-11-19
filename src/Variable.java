
public class Variable extends Expression {
	private String variable;
	private int value;
	
	public Variable(String variable, int value) {
		this.variable = variable;
		this.value = value;
	}
	
	public String getVariable() {
		return variable;
	}
	
	public int getValue() {
		return value;
	}

	@Override
	public void accept(AbstractVisitor visitor) {
		visitor.visit(this);
	}
}
