
public class PloterAdapter implements NewSoftware {
	OldSoftware old;

	public PloterAdapter(OldSoftware old) {
		this.old = old;
	}

	@Override
	public void ispisGrafike(String grafika) {
		
		old.plotGraphics(grafika);

	}

	
		

}
