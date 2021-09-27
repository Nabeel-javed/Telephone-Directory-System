import java.util.*;
public class subscriber {
	
	//all variables that were necessary
	private String firstName;
    private String lastName;											
    private String Phonenumber;
    private String city;
    private String country;
    private String residential_address;
    private String website;
    private String DateofBirth;
    private String mobile;
    private String company;
    private int ID;
    
   
    public subscriber() {
    	//empty
    }
   
    //getter and setter of all variables
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
	public String getPhonenumber() {
		return Phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		Phonenumber = phonenumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getResidential_address() {
		return residential_address;
	}
	public void setResidential_address(String residential_address) {
		this.residential_address = residential_address;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getDateofBirth() {
		return DateofBirth;
	}
	public void setDateofBirth(String dateofBirth) {
		DateofBirth = dateofBirth;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	@Override
	public String toString() {			//to string for display
		return "subscriber [firstName=" + firstName + ", lastName=" + lastName + ", Phonenumber=" + Phonenumber
				+ ", city=" + city + ", country=" + country + ", residential_address=" + residential_address
				+ ", website=" + website + ", DateofBirth=" + DateofBirth + ", mobile=" + mobile + ", company="
				+ company + ", ID=" + ID + "]";
	}
    
  
	 
	

}
