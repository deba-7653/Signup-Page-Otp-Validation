package com.enity;

public class Otp {

	private int id;
	private String otp;

	public Otp() {
		super();
	}

	public Otp(String otp) {
		super();
		this.otp = otp;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

}
