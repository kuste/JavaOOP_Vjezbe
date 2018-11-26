
public interface Observer {

	void subscribe(Observable o);

	String toString();
	String title();

	void update(float temp, float vla, float tlak);

}
