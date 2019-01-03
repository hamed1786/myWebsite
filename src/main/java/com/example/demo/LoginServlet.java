package com.example.demo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		try {
			System.out.println("test");
			System.out.println("customer passed userid : " + req.getParameter("uid"));
			System.out.println("customer passed password : " + req.getParameter("pwd"));
			String userid = req.getParameter("uid"); // john
			String password = req.getParameter("pwd"); // john

			if (userid.equals("java") && password.equals("jee")) {
				req.getSession().setAttribute("isLoggedin", true);
				res.sendRedirect("welcome.html");
			} else {
				req.getSession().setAttribute("isLoggedin", false);
				res.sendRedirect("error.html");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		doGet(req, res);
	}

}