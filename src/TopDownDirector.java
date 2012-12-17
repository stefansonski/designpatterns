import java.util.Vector;


public class TopDownDirector extends Director {

	@Override
	public Operation construct(Vector<Expression> array) {
		for(int i = 0; i < array.size(); i++) {
			if(array.get(i) instanceof Operation) {
				getBuilder().build(((Operation)array.get(i)), array.get(2 * i + 1), array.get(2 * i + 2));
			}
		}
		return (Operation)array.get(0);
	}

}
