
public class Multiplication extends Operation {

	@Override
	public String toString() {
		return "*";
	}

	@Override
	public int operate(int a, int b) {
		return a * b;
	}
	
}
