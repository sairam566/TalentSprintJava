package daytwo;

public class Address {

	private String doorNo;
	private String street;
	private String city;
	
	public Address() {
		
	}

	public Address(String doorNo, String street, String city) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street + ", city=" + city + "]";
	}
	
	
	
}
