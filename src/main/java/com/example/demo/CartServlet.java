package com.example.demo;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CartServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		try {
			System.out.println("customer passed product name : " + req.getParameter("pname"));		//reading parameter from customer Input.
			System.out.println("customer passed quantity : " + req.getParameter("qty"));			//reading parameter from customer Input.
			System.out.println("customer passed price : " + req.getParameter("pri"));				//reading parameter from customer Input.
			String productname = req.getParameter("pname"); // reading the request from customer.
			String quantity = req.getParameter("qty");		// reading the request from customer.
			String price = req.getParameter("pri");			// reading the request from customer.

			int qtyInt = Integer.parseInt(quantity); 		// converting String to a Integer
			int priInt = Integer.parseInt(price);

			int itemTotal = qtyInt * priInt; 				// calculating the total of this item.

			HttpSession cookie = req.getSession();
			if (cookie.getAttribute("total") == null) {
				cookie.setAttribute("total", itemTotal);
			} else {
				int previousTotal = (int) cookie.getAttribute("total");
				itemTotal = itemTotal + previousTotal;
				System.out.println(itemTotal);
				cookie.setAttribute("total", itemTotal);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		doGet(req, res);
	}

}
