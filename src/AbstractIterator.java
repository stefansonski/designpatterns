
public abstract class AbstractIterator implements Iterator{

	protected Operation root;
	protected AbstractVisitor visitor;
	
	public AbstractIterator(Operation root, AbstractVisitor visitor) {
		this.root = root;
		this.visitor = visitor;
	}

}
