
public class Builder {
	public void build(Operation root, Expression left, Expression right) {
		root.setLeft(left);
		root.setRight(right);
	}
}
