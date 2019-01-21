package gui;

import java.util.EventObject;

public class FormDataObject extends EventObject {

	private String name;
	private String mail;
	private String education;
	private String region;
	private String employment;

	public FormDataObject(Object source, String name, String mail, String education, String region, String employment) {
		super(source);
		this.name = name;
		this.mail = mail;
		this.education = education;
		this.region = region;
		this.employment = employment;
	}

	public String getName() {
		return name;
	}

	public String getMail() {
		return mail;
	}

	public String getEducation() {
		return education;
	}

	public String getRegion() {
		return region;
	}

	public String getEmployment() {
		return employment;
	}

	
	
}
