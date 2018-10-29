import java.util.ArrayList;

public interface Observable {

	String getName();

	void add(Observer o);

	void remove(Observer o);

	void notifyObs();

	void mainLogic();
}
