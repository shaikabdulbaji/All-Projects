package lPOJOPlainOldJavaObject;

import java.util.List;

public class kEmployeeWithMultipleNestedJSONArrays {
	
	//Since we need to store more than one address we need to use "List" to serialize JSON Array payload
	
	private String first_name;
	private String last_name;
	private String proffesion;
	private List<iAddressForEmployee> address;
	
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getProffesion() {
		return proffesion;
	}
	public void setProffesion(String proffesion) {
		this.proffesion = proffesion;
	}
	public List<iAddressForEmployee> getAddress() {
		return address;
	}
	public void setAddress(List<iAddressForEmployee> address) {
		this.address = address;
	}
	
	
	

}
