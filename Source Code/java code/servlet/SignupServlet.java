package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.OtpDao;
import com.dao.SignupDao;
import com.db.DBConn;
import com.enity.Otp;
import com.enity.Register;
import com.enity.Signup;


@WebServlet("/signup")
public class SignupServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String adress = req.getParameter("Locality");
		String state = req.getParameter("State");
		String pin = req.getParameter("Zip");
		String country = req.getParameter("country");
		String dob = req.getParameter("dob");
		String gender = req.getParameter("sex");

		String phone = req.getParameter("phone");
		String pass = req.getParameter("password");
		String repass = req.getParameter("cnf-password");
		String otp = req.getParameter("otp");
		HttpSession session = req.getSession();
		OtpDao o=new OtpDao(DBConn.getConn());
		Signup s=new Signup(fname, lname, email, adress, state, pin, country, dob, gender, phone, pass, repass, otp);
		SignupDao dao=new SignupDao(DBConn.getConn());
		boolean f1 = dao.checkUserByPhone(phone);
		
		Otp ot=o.getOtp(otp);
		
		if (ot != null) {
			
			if (pass.equals(repass)) {
				if (f1) {
					boolean f = dao.register(s);
					if (f) {
						
						session.setAttribute("succMsg", "Register Sucessfully");
						
						resp.sendRedirect("register.jsp");

					} else {
						session.setAttribute("errorMsg", "Something wrong on server");
						resp.sendRedirect("signup.jsp");
					}
				} else {
					session.setAttribute("msg", "User Already Exist Try Another Phone Number");
					
					resp.sendRedirect("signup.jsp");
				}
				
				
				
			} else {
				session.setAttribute("msg", "Password Not Matched");
				resp.sendRedirect("signup.jsp");
				
			}
			} else {
				session.setAttribute("msg", "Invalid Otp....");
				resp.sendRedirect("signup.jsp");
			}
			
	
	}

	
}
