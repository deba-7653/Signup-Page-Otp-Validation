package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.enity.Register;
import com.enity.Signup;

public class SignupDao {
	private Connection conn;
	public SignupDao(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public boolean register(Signup r) {
		boolean f = false;
		try {
			String sql = "insert into signup(fname,lname,email,adress,state,pin,country,dob,gender,phone,pass,repass,otp) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,r.getFname());
			ps.setString(2, r.getLname());
			ps.setString(3, r.getEmail());
			ps.setString(4, r.getAdress());
			ps.setString(5, r.getState());
			ps.setString(6, r.getPin());
			ps.setString(7, r.getCountry());
			ps.setString(8, r.getDob());
			ps.setString(9, r.getGender());
			ps.setString(10, r.getPhone());
			ps.setString(11, r.getPass());
			ps.setString(12, r.getRepass());
			ps.setString(13, r.getOtp());
			
			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
}

	
	public boolean checkUserByPhone(String phone) {
		boolean f = true;

		try {
			String sql = "select * from signup where phone=? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, phone);
			

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				f = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}
	
	public Signup login(String em, String psw) {
		Signup p = null;

		try {
			String sql = "select * from signup where email=? and pass=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, em);
			ps.setString(2, psw);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				p = new Signup();
				p.setId(rs.getInt(1));
				p.setFname(rs.getString(2));
				p.setLname(rs.getString(3));
				p.setEmail(rs.getString(4));
				p.setAdress(rs.getString(5));
				p.setState(rs.getString(6));
				p.setPin(rs.getString(7));
				p.setCountry(rs.getString(8));
				p.setDob(rs.getString(9));
				p.setGender(rs.getString(10)); 
				p.setPhone(rs.getString(11)); 
				p.setPass(rs.getString(12)); 
				p.setRepass(rs.getString(13)); 
				p.setOtp(rs.getString(14)); 

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
}
}
