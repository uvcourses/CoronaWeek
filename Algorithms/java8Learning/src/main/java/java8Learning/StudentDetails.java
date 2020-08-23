package java8Learning;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Sheet
public class StudentDetails {

	@SheetColumn("FirstName")
	private String firstName;

	@SheetColumn("LastName")
	private String lastName;

	@SheetColumn("CompanyName")
	private String companyName;

	@SheetColumn("Address")
	private String address;

	@SheetColumn("City")
	private String city;

	@SheetColumn("State")
	private String state;

	@SheetColumn("PhoneNo")
	private String phoneNo;

	@SheetColumn("Email")
	private String email;

	@SheetColumn("Web")
	private String web;

	StudentDetails(String firstName, String lastName, String companyName, String address, String city, String state,
			String phoneNo, String email, String web) { 
		
		this.firstName=firstName; 
		this.lastName=lastName;
		this.companyName=companyName;
		this.address=address; 
		this.city=city;
		this.state=state;
		this.phoneNo=phoneNo;
		this.email=email;
		this.web=web;
		

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

}
