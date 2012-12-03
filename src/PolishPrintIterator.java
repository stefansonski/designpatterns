
public class PolishPrintIterator extends AbstractIterator {
	
	public PolishPrintIterator(Operation root, AbstractVisitor visitor) {
		super(root, visitor);
	}

	@Override
	public void traverse() {
		traverse(root);
		System.out.print("\n");
	}
	
	private void traverse(Expression node) {
		if(node instanceof Operation) {
			Operation op = (Operation)node;
			traverse(op.getLeft());
			traverse(op.getRight());
			node.accept(visitor);
		}
		else {
			node.accept(visitor);
		}
	}
}
