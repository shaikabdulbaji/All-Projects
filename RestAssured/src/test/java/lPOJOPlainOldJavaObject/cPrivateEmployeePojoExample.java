package lPOJOPlainOldJavaObject;

public class cPrivateEmployeePojoExample {
	
	/*
	 * If we have employee dettails as public we can access any where, if the employee details are
	   private we can access by using "getter and setter" methods.
	   
	 * we can create "getter and setter" methods by right on anywhere on eclipse editor go to source and 
	   click on source and click on getter and setter methods.
	 */
	
	private int id;
	private String name;
	private String mobno;
	private String gender;
	private int departid;
	private String address;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getDepartid() {
		return departid;
	}
	public void setDepartid(int departid) {
		this.departid = departid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

	
}
