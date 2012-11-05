
public class PrintIterator extends AbstractIterator {
	
	public PrintIterator(Operation root) {
		super(root);
	}

	@Override
	public void traverse() {
		visit(root);
		System.out.print("\n");
	}
	
	public void visit(Expression node) {
		if(node instanceof Operation) {
			Operation op = (Operation)node;
			System.out.print("(");
			visit(op.getLeft());
			System.out.print(op);
			visit(op.getRight());
			System.out.print(")");
		}
		else {
			System.out.print(node);
		}
	}
}
