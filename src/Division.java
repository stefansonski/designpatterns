
public class Division extends Operation {

	public void accept(AbstractVisitor visitor) {
		visitor.visit(this);
	}
	
}
