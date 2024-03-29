
public class PrintVisitor extends AbstractVisitor {

	@Override
	public void visit(Addition addition) {
		System.out.print("+");
	}

	@Override
	public void visit(Subtraction subtraction) {
		System.out.print("-");
	}

	@Override
	public void visit(Multiplication multiplication) {
		System.out.print("*");
	}

	@Override
	public void visit(Division division) {
		System.out.print("/");
	}

	@Override
	public void visit(Variable variable) {
		System.out.print(variable.getVariable());
	}

	@Override
	public Iterator createIterator(Operation root) {
		return new PrintIterator(root, this);
	}

}
