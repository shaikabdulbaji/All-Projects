package nJSONtoPOJO_Jackson;

public class aAddress {
	
	private int houseNo;
	private String streetName;
	private String city;
	private String state;
	private String country;
	
	
	
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	/*
	 * It is good to store in to a .JSON file(src/test/resourse) for better formatting.
	 * store the payload with default meaningful values.
	 */

}
