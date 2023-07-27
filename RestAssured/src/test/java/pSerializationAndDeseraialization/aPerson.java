package pSerializationAndDeseraialization;

public class aPerson {
	
	/*
	 *  What is Serialization and Deserialization in Rest Assured?
		Serialization is a conversion of the state of a Java object to a byte stream and Deserialization
		is the reverse of it i.e. conversion of a byte stream to corresponding Java object. 
	 	A serialized object can be stored in files, external sources, databases etc and can also be 
		transferred over networks.
	 */
	
	
	private String name;
	private int age;
	
	
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
	
	

}
