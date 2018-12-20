package day1218;

public class Data 
implements Cloneable
{
	private String school;

	public Data() {
	}

	public Data(String school) {
		super();
		this.school = school;
	}

	public String getSchool(){
		return school;
	}

	
	public void setSchool(String school) {
		this.school = school;
	}
	
	public Data getData() throws CloneNotSupportedException{
		Data data =(Data)this.clone();
		return data;
	}
	
}