
public class Variable extends Component {
	private char variable;
	private int value;
	
	public Variable(char variable, int value) {
		this.variable = variable;
		this.value = value;
	}
	
	public void print() {
		System.out.print(variable);
	}
	
	public int evaluate() {
		return value;
	}
}
