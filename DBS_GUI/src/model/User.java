package model;

public class User {

	private String name;
	private String mail;
	private Education education;
	private Region region;
	private Employment employment;
	private int id;
	private static int cnt = 1;
	public User(String name, String mail, Education education, Region region, Employment employment) {
		this.name = name;
		this.mail = mail;
		this.education = education;
		this.region = region;
		this.employment = employment;
		
		this.id = cnt;
		cnt++;
	}
	public String getName() {
		return name;
	}
	public String getMail() {
		return mail;
	}
	public Education getEducation() {
		return education;
	}
	public Region getRegion() {
		return region;
	}
	public Employment getEmployment() {
		return employment;
	}
	public int getId() {
		return id;
	}
	public static int getCnt() {
		return cnt;
	}

	
}
