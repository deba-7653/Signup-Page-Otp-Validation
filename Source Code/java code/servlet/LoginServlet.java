package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.SignupDao;
import com.db.DBConn;
import com.enity.Signup;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	
	
	
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		HttpSession session = req.getSession();

		SignupDao dao = new SignupDao(DBConn.getConn());
		Signup customer = dao.login(email, password);

		if (customer != null) {
			session.setAttribute("signupobj", customer);
			resp.sendRedirect("index.jsp");
		} else {
			session.setAttribute("errorMsg", "Invalid email & password");
			resp.sendRedirect("customer_login.jsp");
		}

	}
	
}
	
	

