import java.util.Vector;

public class Facade {
	private Operation root;
	
	public void createExpression(Vector<Expression> expression) {
		Director constructor = new BottomUpDirector();
		root = constructor.construct(expression);
	}
	
	public void interpret() {
		AbstractVisitor visitor = new EvaluateVisitor();
		Iterator iter = visitor.createIterator(root);
		iter.traverse();
	}
	
	public void print() {
		AbstractVisitor visitor = new PrintVisitor();
		Iterator iter = visitor.createIterator(root);
		iter.traverse();
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
		
		Facade api = new Facade();
		api.createExpression(array);
		api.print();
		api.interpret();
	}
}
