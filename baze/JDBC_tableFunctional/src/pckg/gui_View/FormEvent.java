package pckg.gui_View;

import java.util.EventObject;

public class FormEvent extends EventObject {
	
	String edu;
	String region;
	String name;
	String mail;
	String emplStatus;

	public FormEvent(Object obj, String name, String mail, String emplSt, String region, String edu) {
		
		super(obj);
		this.name = name;
		this.mail = mail;
		this.edu = edu;
		this.region = region;
		this.emplStatus = emplSt;
	}

	public String getEdu() {
		return edu;
	}

	public String getRegion() {
		return region;
	}

	public String getName() {
		return name;
	}

	public String getMail() {
		return mail;
	}

	public String getEmplStatus() {
		return emplStatus;
	}
	
	

}
