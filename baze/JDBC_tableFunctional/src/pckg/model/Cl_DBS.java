package pckg.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Cl_DBS {
	
	private List<Client> clients;
	
	public Cl_DBS() {
		
		clients = new LinkedList<>();
	}
	
	public void addClient2DB(Client client) {
		
		clients.add(client);
	}
	
	public List<Client> getAllClients() {
		
		return Collections.unmodifiableList(clients);
		
	}
	
	public int getNumFields() {
		
		return clients.get(0).getNumFields();
	}

	public void save2File(File file) throws IOException {
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Client[] clnts = clients.toArray(new Client[clients.size()]);
		
		oos.writeObject(clnts);
		oos.close();
		
	}

	public void open4File(File file) throws ClassNotFoundException, IOException {
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Client[] clnts = (Client[]) ois.readObject();
		clients.clear();
		clients.addAll(Arrays.asList(clnts));
		ois.close();
	}

	public void removeClient(int indx) {
		clients.remove(indx);
		for(Client cl: clients) {
			System.out.println(cl.toString());
		}
	}

}
