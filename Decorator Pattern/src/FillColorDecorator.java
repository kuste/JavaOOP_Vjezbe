
public class FillColorDecorator extends ShapeDecorator {
	Color fillColor;

	public FillColorDecorator(BasicShape bs, Color cl) {
		this.decoratedShape = bs;
		this.fillColor = cl;
	}

	public FillColorDecorator() {
		// TODO Auto-generated constructor stub
	}

	public void setBasicShape2Decorate(BasicShape bs) {
		this.decoratedShape = bs;
	}

	public void setFillColor(Color cl) {
		this.fillColor = cl;
	}

	public String shapeName(String name) {
	
		return decoratedShape.shapeName(name);

	}

	public void setshapeName(String name) {
		String newName = "filled with color";
		name = name + newName;
		decoratedShape.shapeName(name);

	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("Filled with color ---> " + fillColor);

	}

	// no change
	@Override
	public void resize(int num) {
		decoratedShape.resize(num);

	}

	@Override
	public String descritption() {

		String des = decoratedShape.descritption() + " filled with " + fillColor + " color";
		return des;
	}

	// no change
	@Override
	public boolean isHide(int num) {
		return decoratedShape.isHide(num);

	}

}
