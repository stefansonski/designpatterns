import java.util.Stack;

public class EvaluateVisitor extends AbstractVisitor {
	
	private Stack<Integer> results = new Stack<Integer>();

	@Override
	public void visit(Addition addition) {
		int right = results.pop();
		int left = results.pop();
		results.push(left + right);
	}

	@Override
	public void visit(Subtraction subtraction) {
		int right = results.pop();
		int left = results.pop();
		results.push(left - right);
	}

	@Override
	public void visit(Multiplication multiplication) {
		int right = results.pop();
		int left = results.pop();
		results.push(left * right);
	}

	@Override
	public void visit(Division division) {
		int right = results.pop();
		int left = results.pop();
		results.push(left / right);
	}

	@Override
	public void visit(Variable variable) {
		results.push(variable.getValue());
	}
	
	public int getResult() {
		return results.pop();
	}

}
