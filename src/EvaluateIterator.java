
public class EvaluateIterator extends AbstractIterator{

	public EvaluateIterator(Operation root) {
		super(root);
	}

	@Override
	public void traverse() {
		System.out.println(visit(root));
	}
	
	public int visit(Expression node) {
		if(node instanceof Operation) {
			Operation op = (Operation)node;
			int left = visit(op.getLeft());
			int right = visit(op.getRight());
			return node.operate(left, right);
		}
		else {
			return node.operate(0, 0);
		}
	}

}
