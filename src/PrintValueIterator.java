
public class PrintValueIterator extends AbstractIterator {
	
	private PrintValueVisitor visitor = new PrintValueVisitor();
	
	public PrintValueIterator(Operation root) {
		super(root);
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
