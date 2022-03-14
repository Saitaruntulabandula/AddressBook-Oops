package com.bridgelabz;

public class Info {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int ZipCode;
	private String mobileNumber;
	private String emailId;

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public int getZipCode() {
		return ZipCode;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZipCode(int zipCode) {
		ZipCode = zipCode;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Info {"+ 
				" Firstname : " +firstName+ 
				", LastName : " +lastName+ 
				", Address : " +address+
				", City : "+city+ 
				", State : " +state+ 
				", ZipCode : " +ZipCode+ 
				", MobileNumber : "+mobileNumber+ 
				", emailId : " +emailId+ 
				" }";	 
	}
}
