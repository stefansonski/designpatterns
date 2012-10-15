public class Node extends Component {
	private Component left;
	private Component right;
	private char operation;
	
	public Node(char operation) {
		this.operation = operation;
	}
	
	public void addLeftComponent(Component component) {
		this.left = component;
	}
	
	public void addRightComponent(Component component) {
		this.right = component;
	}
	
	public void print() {
		System.out.print("(");
		left.print();
		System.out.print(operation);
		right.print();
		System.out.print(")");
	}
	
	public int evaluate() {
		switch(operation) {
		case '+':
			return left.evaluate() + right.evaluate();
		case '-':
			return left.evaluate() - right.evaluate();
		case '*':
			return left.evaluate() * right.evaluate();
		case '/':
			return left.evaluate() / right.evaluate();
		default:
			return 0;
		}
			
	}
	
	public static void main(String[] args) {
		Variable a = new Variable('a',3);
		Variable b = new Variable('b',4);
		Variable c = new Variable('c',7);
		Variable d = new Variable('d',9);
		Node leftNode = new Node('+');
		leftNode.addLeftComponent(a);
		leftNode.addRightComponent(b);
		Node rightNode = new Node('-'); 
		rightNode.addLeftComponent(a);
		rightNode.addRightComponent(c);
		Node root0 = new Node('*');
		root0.addLeftComponent(leftNode);
		root0.addRightComponent(rightNode);
		leftNode = new Node('*');
		leftNode.addLeftComponent(b);
		leftNode.addRightComponent(d);
		Node root1 = new Node('-');
		root1.addLeftComponent(leftNode);
		root1.addRightComponent(a);
		Node root = new Node('+');
		root.addLeftComponent(root0);
		root.addRightComponent(root1);
		root.print();
		
		System.out.println("\n" + root.evaluate());
	}
}
