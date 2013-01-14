import java.util.Vector;

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
}
