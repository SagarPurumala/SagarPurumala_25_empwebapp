package com.capg.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capg.empwebapp.bean.Employee;
import com.capg.empwebapp.dao.EmployeeDAO;
import com.capg.empwebapp.dao.EmployeeDAOImple;
@WebServlet("./updateEmployee")
public class UpdateEmployee extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id1");
		String name = req.getParameter("name");
		Employee bean = new Employee();
		bean.setId(Integer.parseInt(id));
		bean.setName(name);

		EmployeeDAO dao = new EmployeeDAOImple();
		boolean check = dao.updateEmployee(bean);
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>");

		if (check == true) {
			out.println("Updation sucessfull");
		} else {
			out.println("Updation unsucessfull");
		}
		 RequestDispatcher dispatcher=req.getRequestDispatcher("/homepage.html");
		    dispatcher.include(req, resp);
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
}
}
