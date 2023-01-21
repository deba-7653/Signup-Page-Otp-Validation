package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.enity.Otp;



public class OtpDao {

	private Connection conn;

	public OtpDao(Connection conn) {
		super();
		this.conn = conn;
	}

	public Otp getOtp(String otp){
		
		Otp o = null;
		try {
			String sql = "select * from otp where otp=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, otp);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				o = new Otp();
				o.setId(rs.getInt(1));
				o.setOtp(rs.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return o;
	}
	public boolean addOtp(Otp o) {
		boolean f = false;
		try {
			String sql = "insert into otp(otp) values(?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, o.getOtp());
		
			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
}
