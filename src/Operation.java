/**
 * Flexibility:
 * It is easy to add new operation to this pattern.
 * Therefor only {@link #setOperation()} has to be called in the constructor of a new Operation.
 * Also {@link #evaluate()} has to be implemented depending on the new operation.
 * @author Stefan Sonski
 */
abstract public class Operation extends Expression {
	private Expression left;
	private Expression right;
	
	public void setLeft(Expression expression) {
		this.left = expression;
	}
	
	public void setRight(Expression expression) {
		this.right = expression;
	}
	
	public Expression getLeft() {
		return left;
	}
	
	public Expression getRight() {
		return right;
	}
	
	public static void main(String[] args) {
		Variable a = new Variable("a",3);
		Variable b = new Variable("b",4);
		Variable c = new Variable("c",7);
		Variable d = new Variable("d",9);
		Operation leftNode = new Addition();
		leftNode.setLeft(a);
		leftNode.setRight(b);
		Subtraction rightNode = new Subtraction(); 
		rightNode.setLeft(a);
		rightNode.setRight(c);
		Multiplication root0 = new Multiplication();
		root0.setLeft(leftNode);
		root0.setRight(rightNode);
		leftNode = new Multiplication();
		leftNode.setLeft(b);
		leftNode.setRight(d);
		Subtraction root1 = new Subtraction();
		root1.setLeft(leftNode);
		root1.setRight(a);
		Addition root = new Addition();
		root.setLeft(root0);
		root.setRight(root1);
		
		AbstractVisitor visitor = new PrintVisitor();
		Iterator iter = visitor.createIterator(root);
		iter.traverse();
		
		visitor = new PolishPrintVisitor();
		iter = visitor.createIterator(root);
		iter.traverse();

		visitor = new PrintValueVisitor();
		iter = visitor.createIterator(root);
		iter.traverse();
		
		visitor = new EvaluateVisitor();
		iter = visitor.createIterator(root);
		iter.traverse();
		
	}
}
