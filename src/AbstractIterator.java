
public abstract class AbstractIterator implements Iterator{

	protected Operation root;
	
	public AbstractIterator(Operation root) {
		this.root = root;
	}

}
