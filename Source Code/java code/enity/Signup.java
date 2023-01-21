package com.enity;

public class Signup {

	private int id;
	private String fname;
	private String lname;
	private String email;
	private String adress;
	private String state;
	private String pin;
	private String country;
	private String dob;
	private String gender;

	private String phone;
	private String pass;
	private String repass;
	
	private String otp;

	
	
	
	
	
	public Signup() {
		super();
	}



	public Signup(String fname, String lname, String email, String adress, String state, String pin, String country,
			String dob, String gender, String phone, String pass, String repass, String otp) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.adress = adress;
		this.state = state;
		this.pin = pin;
		this.country = country;
		this.dob = dob;
		this.gender = gender;
		this.phone = phone;
		this.pass = pass;
		this.repass = repass;
		this.otp = otp;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAdress() {
		return adress;
	}



	public void setAdress(String adress) {
		this.adress = adress;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getPin() {
		return pin;
	}



	public void setPin(String pin) {
		this.pin = pin;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getDob() {
		return dob;
	}



	public void setDob(String dob) {
		this.dob = dob;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getPass() {
		return pass;
	}



	public void setPass(String pass) {
		this.pass = pass;
	}



	public String getRepass() {
		return repass;
	}



	public void setRepass(String repass) {
		this.repass = repass;
	}



	public String getOtp() {
		return otp;
	}



	public void setOtp(String otp) {
		this.otp = otp;
	}
	
	

}
