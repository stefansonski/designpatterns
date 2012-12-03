
public abstract class AbstractVisitor {
	public abstract Iterator createIterator(Operation root);
	public abstract void visit(Addition addition);
	public abstract void visit(Subtraction subtraction);
	public abstract void visit(Multiplication multiplication);
	public abstract void visit(Division division);
	public abstract void visit(Variable variable);
}
