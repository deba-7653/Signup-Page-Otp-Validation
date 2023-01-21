package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.OtpDao;
import com.dao.RegisterDao;
import com.db.DBConn;
import com.email.SendEmail;
import com.enity.Otp;
import com.enity.Register;
import com.otp.OtpGenerete;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();

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
		if (pass.equals(repass)) {
			RegisterDao d=new RegisterDao(DBConn.getConn());
			boolean f = d.checkUserByPhone(phone);
			
			if (f) {
				Register r = new Register(fname, lname, email, adress, state, pin, country, dob, gender,phone,
						pass, repass);
					
					
				char[] generateOTP = OtpGenerete.generateOTP(6);
				String otp = String.copyValueOf(generateOTP);
				OtpDao dao = new OtpDao(DBConn.getConn());
				Otp o = new Otp(otp);

				SendEmail.sendEmail("Your Verification Otp is: " + otp, "Verify Otp", email,
						"debadatta2468.info@gmail.com");

				if (dao.addOtp(o) && d.register(r)) {
					session.setAttribute("customerobj", new Register(phone));
					session.setAttribute("succMsg", "Otp Sent To Ur Email...");
					resp.sendRedirect("signup.jsp");

				} else {
					session.setAttribute("failed", "Something Wrong On Server");
					resp.sendRedirect("register.jsp");
				}
			} else {
				session.setAttribute("msg", "User Already Exist Try Another Phone Number");
				
				resp.sendRedirect("register.jsp");
			}

			} else {
				session.setAttribute("msg", "Password Not Matched");
				resp.sendRedirect("register.jsp");
			}
			
			
	}

}
