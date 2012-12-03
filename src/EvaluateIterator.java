
public class EvaluateIterator extends AbstractIterator{
	
	protected EvaluateVisitor visitor;

	public EvaluateIterator(Operation root, EvaluateVisitor visitor) {
		super(root, visitor);
		this.visitor = visitor;
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
