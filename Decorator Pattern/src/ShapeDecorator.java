
public abstract class ShapeDecorator implements BasicShape {

	protected BasicShape decoratedShape;

	public void setShape2Decorator(BasicShape bs) {
		this.decoratedShape = bs;
	}

	
}
