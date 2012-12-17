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
	
	public static void main(String[] args) {
		Variable a = new Variable("a",3);
		Variable b = new Variable("b",4);
		Variable c = new Variable("c",7);
		Variable d = new Variable("d",9);
		
		Vector<Expression> array = new Vector<Expression>();
		
		array.add(new Addition());
		
		array.add(new Multiplication());
		array.add(new Subtraction());
		
		array.add(new Addition());
		array.add(new Subtraction());
		array.add(new Multiplication());
		array.add(a);
		
		array.add(a);
		array.add(b);
		array.add(a);
		array.add(c);
		array.add(b);
		array.add(d);		
		
		TopDownDirector td = new TopDownDirector();
		Operation root  = td.construct(array);
		
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
		
		BottomUpDirector bu = new BottomUpDirector();
		root = bu.construct(array);
		
		visitor = new PrintVisitor();
		iter = visitor.createIterator(root);
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
