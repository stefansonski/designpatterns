import java.util.Vector;

public abstract class Director {
	private Builder builder;
	
	public Director() {
		this.builder = new Builder();
	}
	
	protected Builder getBuilder() {
		return builder;
	}
	
	public abstract Operation construct(Vector<Expression> array);
}
