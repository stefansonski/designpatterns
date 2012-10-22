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
	private char operation;
	
	public void setLeftComponent(Expression expression) {
		this.left = expression;
	}
	
	public void setRightComponent(Expression expression) {
		this.right = expression;
	}
	
	public void print() {
		System.out.print("(");
		left.print();
		System.out.print(operation);
		right.print();
		System.out.print(")");
	}
	
	public Expression getLeftComponent() {
		return left;
	}
	
	public Expression getRightComponent() {
		return right;
	}
	
	public void setOperation(char operation) {
		this.operation = operation;
	}
	
	abstract public int evaluate();	
	
	public static void main(String[] args) {
		Variable a = new Variable('a',3);
		Variable b = new Variable('b',4);
		Variable c = new Variable('c',7);
		Variable d = new Variable('d',9);
		Operation leftNode = new Addition();
		leftNode.setLeftComponent(a);
		leftNode.setRightComponent(b);
		Subtraction rightNode = new Subtraction(); 
		rightNode.setLeftComponent(a);
		rightNode.setRightComponent(c);
		Multiplication root0 = new Multiplication();
		root0.setLeftComponent(leftNode);
		root0.setRightComponent(rightNode);
		leftNode = new Multiplication();
		leftNode.setLeftComponent(b);
		leftNode.setRightComponent(d);
		Subtraction root1 = new Subtraction();
		root1.setLeftComponent(leftNode);
		root1.setRightComponent(a);
		Addition root = new Addition();
		root.setLeftComponent(root0);
		root.setRightComponent(root1);
		root.print();
		
		System.out.println("\n" + root.evaluate());
	}
}
