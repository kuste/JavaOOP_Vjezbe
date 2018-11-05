
public class LineColorDecorator extends ShapeDecorator {

	Color lineColor;

	public LineColorDecorator(BasicShape bs, Color c) {
		this.decoratedShape = bs;
		this.lineColor = c;
	}

	public LineColorDecorator() {
		// TODO Auto-generated constructor stub
	}

	public void setBasicShape2Decorate(BasicShape bs) {
		this.decoratedShape = bs;
	}

	public void setLineColor(Color c) {
		this.lineColor = c;
	}

	@Override
	public String shapeName(String name) {
		return decoratedShape.shapeName(name) + " Line color: " + lineColor;

	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("Lines with color ---> " + lineColor);
	}

	// no change
	@Override
	public void resize(int num) {
		decoratedShape.resize(num);

	}

	@Override
	public String descritption() {
		return decoratedShape.descritption() + " with colored lines: " + lineColor;

	}

	// no change
	@Override
	public boolean isHide(int num) {

		return decoratedShape.isHide(num);
	}

}
