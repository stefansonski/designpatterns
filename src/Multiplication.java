
public class Multiplication extends Operation {

	@Override
	public void accept(AbstractVisitor visitor) {
		visitor.visit(this);
	}
	
}
