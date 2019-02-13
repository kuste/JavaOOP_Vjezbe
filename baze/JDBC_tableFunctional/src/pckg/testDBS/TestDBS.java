package pckg.testDBS;


import pckg.model.Cl_DBS;
import pckg.model.Client;

public class TestDBS {

	private static Cl_DBS dbs = new Cl_DBS();

	public static void main(String[] args) throws Exception {
		dbs.connent2DBS();
		dbs.addClient2DB(new Client("Ivica", "mail@net.hr", "Elementary school", "North region", "Employed", 0));
		dbs.addClient2DB(new Client("Marica", "mail2@net.hr", "Higher education", "West region", "Employed", 1));
		dbs.addClient2DB(new Client("Frano", "mail123@cronet.hr", "PhD", "South region", "Employed", 2));
		dbs.save2MySQL();
		dbs.loadFromMySQL();
		dbs.disconnectFromDBS();

	}

}
