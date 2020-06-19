package com.capg.empwebapp.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capg.empwebapp.bean.Employee;
import com.capg.empwebapp.dao.EmployeeDAO;
import com.capg.empwebapp.dao.EmployeeDAOImple;


public class SeeAllEmployeee extends HttpServlet{
	 
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
			req.getRequestDispatcher("showEmployee.jsp").forward(req, resp);
	}

}