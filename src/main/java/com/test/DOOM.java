
package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DOOM
 */

@WebServlet("/DOOM")
public class DOOM extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { // TODO Auto-generated method stub //
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String user = "springstudent";
		String pass = "springstudent";
		String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
		String driver = "com.mysql.cj.jdbc.Driver";

		// getConnectionTo Db

		try {
			PrintWriter pr = response.getWriter();
			pr.write("connecting to DB" + jdbcUrl); // pr will send "text "this on web page (pr change a`ny texyt HTML)
			pr.append("DREKSHA-DYNAMIC _CODE");
			pr.append("<h1>DOOM </h1>");
			Class.forName(driver);
			Connection con = DriverManager.getConnection(jdbcUrl, user, pass);

			System.out.println("Success !");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();

			throw new ServletException(e);
		}

	}

} // NOTE JAVA Version must be same in Both PLACE Project Faced+ JDK pointing
	// in build path
