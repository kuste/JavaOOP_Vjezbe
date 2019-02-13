package pckg.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Cl_DBS {

	private List<Client> clients;
	private Connection con;

	public Cl_DBS() {

		clients = new LinkedList<>();
	}

	public void addClient2DB(Client client) {

		clients.add(client);
	}

	public void connent2DBS() throws Exception {
		if (con != null)
			return;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7278935";
			String user = "sql7278935";
			String password = "4C4K41ZhK2";
			con = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {

			throw new Exception("Driver could not be found");
		}
		System.out.println("Succes -> connected to DBS -> " + con);

	}

	public void disconnectFromDBS() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

			System.out.println("Disconnecteeeeeeeeeted form DBS -> " + con);
		}
	}

	public void save2MySQL() {
		String checkSql = "select count(*) as count from Klijenti where id=?";
		String insertSql = "insert into Klijenti (id,name,mail,education,region,employed) values (?,?,?,?,?,?)";
		String updateSql = "update Klijenti set name=?, mail=?, education=?,region=?,employed=? where id=?";
		try {
			PreparedStatement checkStatement = con.prepareStatement(checkSql);
			PreparedStatement insertStatement = con.prepareStatement(insertSql);
			PreparedStatement updateStatement = con.prepareStatement(updateSql);
			for (Client cli : clients) {
				int id = cli.getId();
				checkStatement.setInt(1, id);
				ResultSet checkRes = checkStatement.executeQuery();
				checkRes.next();
				String name = cli.getName();
				String mail = cli.getMail();
				EducationCategory education = cli.getEduCat();
				RegionCategory region = cli.getRegCat();
				EmploymentCategory employed = cli.getEmplCat();

				int count = checkRes.getInt(1);
				System.out.println("Client with id " + id + "has -> " + count + " records in DBS");
				if (count == 0) {
					System.out.println("Insert client with id -> " + id);
					int col = 1;
					insertStatement.setInt(col++, id);
					insertStatement.setString(col++, name);
					insertStatement.setString(col++, mail);
					insertStatement.setString(col++, education.name());
					insertStatement.setString(col++, region.name());
					insertStatement.setString(col++, employed.name());

					insertStatement.executeUpdate();
				} else {
					System.out.println("Update client with id -> " + id);
					int col = 1;
					updateStatement.setString(col++, name);
					updateStatement.setString(col++, mail);
					updateStatement.setString(col++, education.name());
					updateStatement.setString(col++, region.name());
					updateStatement.setString(col++, employed.name());
					updateStatement.setInt(col++, id);

					updateStatement.executeUpdate();
				}

			}
			checkStatement.close();
			insertStatement.close();
			updateStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void loadFromMySQL() {
		clients.clear();
		String selectSql = "select id,name,mail,education,region,employed from Klijenti order by name";
		try {
			Statement selectStatement = con.createStatement();
			ResultSet selectRes = selectStatement.executeQuery(selectSql);
			while (selectRes.next()) {
				int id = selectRes.getInt("id");
				String name = selectRes.getString("name");
				String mail = selectRes.getString("mail");
				String education = selectRes.getString("education");
				String region = selectRes.getString("region");
				String employed = selectRes.getString("employed");

				Client client = new Client(id, name, mail, education, region, employed);
				clients.add(client);
			}
			selectRes.close();
			selectStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for (Client c : clients) {
			System.out.println(c.toString());
		}
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
		for (Client cl : clients) {
			System.out.println(cl.toString());
		}
	}

}
