package nJSONtoPOJO_Jackson;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class jEmployee {
	
	private String name;
	private int age;
	@JsonInclude(JsonInclude.Include.NON_DEFAULT)
	private boolean married;
	private String address;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String mobileNo;
	private List<String> skillset;
	private Map<String,String> familymembers;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean getMarried() {
		return married;
	}
	public void setMarried(boolean b) {
		this.married = b;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public List<String> getSkillset() {
		return skillset;
	}
	public void setSkillset(List<String> skillset) {
		this.skillset = skillset;
	}
	public Map<String, String> getFamilymembers() {
		return familymembers;
	}
	public void setFamilymembers(Map<String, String> familymembers) {
		this.familymembers = familymembers;
	}
	
	
	
	

}
