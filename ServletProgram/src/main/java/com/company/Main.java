package com.company;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Main() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter printerWriter = response.getWriter();
		String title = "WELCOME PAGE";

		if ((request.getParameter("firstName") == null || request.getParameter("firstName").trim().length() == 0)
				&& (request.getParameter("lastName") == null
						|| request.getParameter("lastName").trim().length() == 0)) {
			printerWriter.println("<html>\n" + "<head><title>" + title + "</title></head>\n"
					+ "<body bgcolor=\"#F0F8FF\">\n"
					+ " <p align=\"center\" style=\"font-family: helvetica; font-size: 30px\"> PLEASE ENTER YOUR FIRST NAME AND LAST NAME! </p> "
					+ "\n" + "</body></html>");
		}

		else if (request.getParameter("firstName") == null || request.getParameter("firstName").trim().length() == 0) {

			printerWriter.println("<html>\n" + "<head><title>" + title + "</title></head>\n"
					+ "<body bgcolor=\"#F0F8FF\">\n"
					+ " <p align=\"center\" style=\"font-family: helvetica; font-size: 30px\"> PLEASE ENTER YOUR FIRST NAME! </p> "
					+ "\n" + "</body></html>");

		} else if (request.getParameter("lastName") == null || request.getParameter("lastName").trim().length() == 0) {

			printerWriter.println("<html>\n" + "<head><title>" + title + "</title></head>\n"
					+ "<body bgcolor=\"#F0F8FF\">\n"
					+ " <p align=\"center\" style=\"font-family: helvetica; font-size: 30px\"> PLEASE ENTER YOUR LAST NAME! </p> "
					+ "\n" + "</body></html>");

		}

		else if (request.getParameter("gender") == null || request.getParameter("gender").trim().length() == 0) {

			printerWriter
					.println("<html>\n" + "<head><title>" + title + "</title></head>\n" + "<body bgcolor=\"#F0F8FF\">\n"
							+ " <p align=\"center\" style=\"font-family:helvetica; font-size: 30px\"> PLEASE SELECT YOUR GENDER! </p> "
							+ "\n" + "</body></html>");

		} else {

			String gender = request.getParameter("gender");
			switch (gender) {

			case "male":

				printerWriter.println("<html>\n" + "<head><title>" + title + "</title></head>\n"
						+ "<body bgcolor=\"#FFF0F5\">\n" + "<h1 align=\"center\" style= \"font-family: helvetica; font-size: 50px\"> Welcome to my Shop </h1> "
						+ " <p align=\"center\" style=\"font-family: helvetica; font-size: 30px\"> Thank you Mr. "
						+ request.getParameter("firstName") + " " + request.getParameter("lastName") + "." + " </p>" + "\n"
						+ "</body></html>");

				break;
			case "female":

				printerWriter.println("<html>\n" + "<head><title>" + title + "</title></head>\n"
						+ "<body bgcolor=\"#FFF0F5\">\n" + "<h1 align=\"center\" style= \"font-family: helvetica; font-size: 50px\">Welcome to my Shop</h1> "
						+ " <p align=\"center\" style=\"font-family: helvetica; font-size: 30px\"> Thank you Ms. "
						+ request.getParameter("firstName") + " " + request.getParameter("lastName") + "." + "</p>" + "\n"
						+ "</body></html>");

				break;
			case "other":

				printerWriter.println("<html>\n" + "<head><title>" + title + "</title></head>\n"
						+ "<body bgcolor=\"#FFF0F5\">\n" + "<h1 align=\"center\" style= \"font-family: helvetica; font-size: 50px\">Welcome to my Shop</h1> "
						+ " <p align=\"center\" style=\"font-family: helvetica ;font-size: 30px\"> Thank you  "
						+ request.getParameter("firstName") + " " + request.getParameter("lastName") + "." + "</p>"
						+ "</body></html>");

				break;
			default:
				System.out.println("Error");

			}

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}

