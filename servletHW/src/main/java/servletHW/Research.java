package servletHW;

import java.util.Arrays;

public class Research {
	private String name;
	private String english;
	private String[] otherLanguage;
	private String opinion;
	private String age;
	
	public Research(){
		
	}

	public Research(String name, String english, String[] otherLanguage, String opinion, String age) {
		super();
		this.name = name;
		this.english = english;
		this.otherLanguage = otherLanguage;
		this.opinion = opinion;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Research [name=" + name + ", english=" + english + ", otherLanguage=" + Arrays.toString(otherLanguage)
				+ ", opinion=" + opinion + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public String[] getOtherLanguage() {
		return otherLanguage;
	}

	public void setOtherLanguage(String[] otherLanguage) {
		this.otherLanguage = otherLanguage;
	}

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	
	
	
}
