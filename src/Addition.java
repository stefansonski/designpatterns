
public class Addition extends Operation {

	@Override
	public void accept(AbstractVisitor visitor) {
		visitor.visit(this);
	}

}
