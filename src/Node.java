abstract public class Node extends Component {
	private Component left;
	private Component right;
	private char operation;
	
	public void setLeftComponent(Component component) {
		this.left = component;
	}
	
	public void setRightComponent(Component component) {
		this.right = component;
	}
	
	public void print() {
		System.out.print("(");
		left.print();
		System.out.print(operation);
		right.print();
		System.out.print(")");
	}
	
	public Component getLeftComponent() {
		return left;
	}
	
	public Component getRightComponent() {
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
		Node leftNode = new AddNode();
		leftNode.setLeftComponent(a);
		leftNode.setRightComponent(b);
		SubNode rightNode = new SubNode(); 
		rightNode.setLeftComponent(a);
		rightNode.setRightComponent(c);
		MulNode root0 = new MulNode();
		root0.setLeftComponent(leftNode);
		root0.setRightComponent(rightNode);
		leftNode = new MulNode();
		leftNode.setLeftComponent(b);
		leftNode.setRightComponent(d);
		SubNode root1 = new SubNode();
		root1.setLeftComponent(leftNode);
		root1.setRightComponent(a);
		AddNode root = new AddNode();
		root.setLeftComponent(root0);
		root.setRightComponent(root1);
		root.print();
		
		System.out.println("\n" + root.evaluate());
	}
}
