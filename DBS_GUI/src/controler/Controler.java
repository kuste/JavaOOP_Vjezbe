package controler;

import java.util.List;

import gui.FormDataObject;
import model.DataBase;
import model.Education;
import model.Employment;
import model.Region;
import model.User;

public class Controler {

	private DataBase db;

	public Controler() {

		db = new DataBase();
	}

	public void addUser2Dbs(FormDataObject fdo) {

		String name = fdo.getName();
		String mail = fdo.getMail();
		String education = fdo.getEducation();
		String region = fdo.getRegion();
		String employment = fdo.getEmployment();

		Education edu = returnEducation(education);
		Region reg = returnRegion(region);
		Employment emp = returnEmployment(employment);

		User user = new User(name, mail, edu, reg, emp);
		db.addUsers(user);
		
		
	}

	private Education returnEducation(String education) {
		switch (education) {
		case "Higher education":
			return Education.higher;
		case "Elementary school":
			return Education.elementary;
		case "Bachelor's degree":
			return Education.bachelor;
		case "Master's degree":
			return Education.masters;
		case "PhD":
			return Education.PhD;
		}
		return null;

	}

	private Region returnRegion(String region) {
		switch (region) {
		case "North region":
			return Region.north;
		case "South region":
			return Region.south;
		case "Eeast region":
			return Region.east;
		case "West region":
			return Region.west;
		}
		return null;

	}

	private Employment returnEmployment(String emp) {
		switch (emp) {
		case "Employed":
			return Employment.employed;
		case "Unemployed":
			return Employment.unemployed;

		}
		return null;

	}
	
	public List<User> getData4Db(){
		return db.getDB();
	}
}
