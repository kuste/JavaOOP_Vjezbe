
public class App {

	public static void main(String[] args) {

		BasicShape c1 = new Circle();
		c1.shapeName("22222");
		System.out.println(c1.descritption());
		c1.draw();

		System.out.println("Create decorating circle with: ");
		System.out.println("1 - line color with purple color");
		System.out.println("2 - line thickness of 3.45");
		System.out.println("3 - lne style ---> doutble dash");
		System.out.println("4 - filled with color yellow");
		System.out.println("*******************Start Decoration********************");
		LineColorDecorator lcd = new LineColorDecorator();
		lcd.setBasicShape2Decorate(c1);
		lcd.setLineColor(Color.PURPLE);
//		lcd.shapeName("LineColorName: ");
//		lcd.descritption();
//		lcd.draw();

		LineThicknessDecorator lnd = new LineThicknessDecorator();
		lnd.setBasicShape2Decorate(lcd);
		lnd.setLineThickness(3.45);
//		lnd.descritption();
//		lnd.draw();

		LineStyleDecorator lsd = new LineStyleDecorator();
		lsd.setBasicShape2Decorate(lnd);
		lsd.setLineStyle(LineStyle.DOUBLE_DASH);
//		lsd.descritption();
//		lsd.draw();

		FillColorDecorator fcd = new FillColorDecorator();
		fcd.setBasicShape2Decorate(lsd);
		fcd.setFillColor(Color.YELLOW);
		fcd.descritption();
		fcd.draw();
		
		System.out.println("/////////////////////////////////////////////////");
		BasicShape t = new Trokut();
		t.shapeName("");
		t = new FillColorDecorator(new LineStyleDecorator(new LineThicknessDecorator(new LineColorDecorator(t, Color.BLUE), 2.32), LineStyle.DASH_DOT),Color.RED);
		t.descritption();
		t.draw();
		System.out.println("/////////////////////////////////////////////////");
		BasicShape t2 = new Trokut();
		t2.shapeName("");
		t2 = new FillColorDecorator(t2,	Color.PURPLE);
		t2 = new LineStyleDecorator(t2, LineStyle.DOT);
		t2 = new LineColorDecorator(t2, Color.GREEN);
		t2 = new FillColorDecorator(t2, Color.WHITE);
		t2.draw();
		
	}

}
