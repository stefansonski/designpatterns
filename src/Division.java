
public class Division extends Operation {

	@Override
	public String toString() {
		return "/";
	}

	@Override
	public int operate(int a, int b) {
		if(b != 0)
			return a / b;
		else
			return 0;
	}
	
}
