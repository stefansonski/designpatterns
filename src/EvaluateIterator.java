
public class EvaluateIterator extends AbstractIterator{
	
	private EvaluateVisitor visitor = new EvaluateVisitor();

	public EvaluateIterator(Operation root) {
		super(root);
	}

	@Override
	public void traverse() {
		traverse(root);
		System.out.print(visitor.getResult());
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
