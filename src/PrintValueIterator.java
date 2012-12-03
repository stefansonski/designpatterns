
public class PrintValueIterator extends AbstractIterator {
	
	public PrintValueIterator(Operation root, AbstractVisitor visitor) {
		super(root, visitor);
	}

	@Override
	public void traverse() {
		traverse(root);
		System.out.print(" = ");
	}
	
	private void traverse(Expression node) {
		if(node instanceof Operation) {
			Operation op = (Operation)node;
			System.out.print("(");
			traverse(op.getLeft());
			node.accept(visitor);
			traverse(op.getRight());
			System.out.print(")");
		}
		else {
			node.accept(visitor);
		}
	}
}
