package pckg.model;

import java.io.Serializable;

import javax.swing.JOptionPane;

public class Client implements Serializable {

	private String name;
	private String mail;
	private EducationCategory eduCat;
	private RegionCategory regCat;
	private EmploymentCategory emplCat;
	private static int cnt = 1;
	private int id;

	public Client(String name, String mail, String education, String region, String employment, int sz) {

		this.name = name;
		this.mail = mail;
		this.eduCat = eduCategory(education);
		this.regCat = regCategory(region);
		this.emplCat = emplCategory(employment);
//		JOptionPane.showMessageDialog(null, Integer.toString(sz), "DBS size", JOptionPane.INFORMATION_MESSAGE);
		if(sz == 0) {
			cnt = 1;
			this.id = cnt;
			cnt++;
		} else if (sz > 0) {
			cnt = sz + 1;
			this.id = cnt;
			cnt++;
		} else {
			this.id = cnt;
			cnt++;
		}

	}

	private EmploymentCategory emplCategory(String employment) {
		switch (employment) {

		case ("Employed"):
			return EmploymentCategory.Employed;
		case ("Unemployed"):
			return EmploymentCategory.Unemployed;

		}
		return null;
	}

	private RegionCategory regCategory(String region) {

		switch (region) {
		case ("North region"):
			return RegionCategory.NORTH_REG;
		case ("South region"):
			return RegionCategory.SOUTH_REG;
		case ("West region"):
			return RegionCategory.WEST_REG;
		case ("East region"):
			return RegionCategory.EAST_REG;
		}
		return null;
	}

	private EducationCategory eduCategory(String edu) {

		switch (edu) {
		case ("Elementary school"):
			return EducationCategory.ELEMENTARY;
		case ("Higher education"):
			return EducationCategory.HIGHER;
		case ("Bachelor's degree"):
			return EducationCategory.BACHELOR;
		case ("Master's degree"):
			return EducationCategory.MASTER;
		case ("PhD"):
			return EducationCategory.PHD;
		}

		return null;
	}

	public String getName() {
		return name;
	}

	public String getMail() {
		return mail;
	}

	public EducationCategory getEduCat() {
		return eduCat;
	}

	public RegionCategory getRegCat() {
		return regCat;
	}

	public EmploymentCategory getEmplCat() {
		return emplCat;
	}

	public int getId() {
		return id;
	}

	public int getNumFields() {

		int nums = getClass().getDeclaredFields().length - 1;

		return nums;
	}

}
