import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Master> list = new ArrayList<>();

		list.add(new NoviceMaster("Marko"));
		list.add(new ExperincedMaster("Josipa"));
		list.add(new SupremeMaster("Vedrana"));
		Apprentice ap = new Apprentice("Stipe");
		ap.bringTools();
		ap.askforQuestion();
		System.out.println("++++++++++++++++++++++++++++++++");
		SupremeMaster sm = new SupremeMaster("Emperor supreme master");
	
		
		list.forEach(mst -> mst.askforAdvice());
		list.forEach(mst -> {
			try {
				System.out.println("+++++++++++++++++++++++++++++");
				mst.giveAdvice();
				mst.bringTools();
				mst.performMaintance();
				mst.performRepair();
				sm.evaluateWork(mst);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

	}

}
