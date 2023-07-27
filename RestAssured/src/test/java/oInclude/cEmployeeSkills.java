package oInclude;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import oInclude.aEmployee;

@JsonIncludeProperties(value = {"name", "skills"})
public class cEmployeeSkills extends aEmployee {
	
	private String skills;

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}
	
	

}
