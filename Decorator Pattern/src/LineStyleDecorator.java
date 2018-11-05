
public class LineStyleDecorator extends ShapeDecorator {
	LineStyle lineStyle;

	public LineStyleDecorator(BasicShape bs, LineStyle ls) {
		this.lineStyle = ls;
		this.decoratedShape = bs;
	}

	public LineStyleDecorator() {
		// TODO Auto-generated constructor stub
	}

	public void setLineStyle(LineStyle ls) {
		this.lineStyle = ls;
	}

	public void setBasicShape2Decorate(BasicShape bs) {
		this.decoratedShape = bs;
	}

	@Override
	public String shapeName(String name) {
		
		return decoratedShape.shapeName(name + "line style " + lineStyle);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("Line style: " + lineStyle);

	}

	@Override
	public void resize(int num) {
		decoratedShape.resize(num);

	}

	@Override
	public String descritption() {

		return decoratedShape.descritption() + " with line style ---> " + lineStyle;
	}

	@Override
	public boolean isHide(int num) {

		return decoratedShape.isHide(num);
	}

}
