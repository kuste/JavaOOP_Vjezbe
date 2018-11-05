
public class LineThicknessDecorator extends ShapeDecorator {

	protected double lineThickness;

	public LineThicknessDecorator(BasicShape bs, double lt) {
		this.decoratedShape = bs;
		this.lineThickness = lt;
	}

	public LineThicknessDecorator() {
		// TODO Auto-generated constructor stub
	}

	public void setBasicShape2Decorate(BasicShape bs) {
		this.decoratedShape = bs;
	}

	public void setLineThickness(double line) {
		this.lineThickness = line;
	}

	@Override
	public String shapeName(String name) {
		return decoratedShape.shapeName(name);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("with lines thickness:  : " + lineThickness);

	}

	@Override
	public void resize(int num) {
		decoratedShape.resize(num);

	}

	@Override
	public String descritption() {
		
		return decoratedShape.descritption()+ " with new line thickness --> "+lineThickness;
	}

	@Override
	public boolean isHide(int num) {
		
		return decoratedShape.isHide(num);
	}

}
