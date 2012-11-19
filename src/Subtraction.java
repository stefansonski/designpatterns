
public class Subtraction extends Operation {

	@Override
	public void accept(AbstractVisitor visitor) {
		visitor.visit(this);
	}
	
}
