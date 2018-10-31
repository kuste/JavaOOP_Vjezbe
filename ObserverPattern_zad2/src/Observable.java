import java.awt.Container;

public interface Observable {
	
	void add(Observer o);

	void remove(Observer o);

	void notifyObs();

	
	

}
