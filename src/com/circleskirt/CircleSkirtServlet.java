package com.circleskirt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.circleskirt.dto.Skirt;

@WebServlet("/results")
public class CircleSkirtServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Skirt skirt = new Skirt();
		
		skirt.setSkirtLength(Double.parseDouble(request.getParameter("skirtLength")));
		skirt.setWaist(Double.parseDouble(request.getParameter("waist")));
		skirt.setVerticalAngle(Double.parseDouble(request.getParameter("verticalAngle")));

		skirt.calculateSkirt();
		
		System.out.println(skirt.getArcAngle() +" "+ skirt.getInnerRadius() +" "+ skirt.getOuterRadius());
		
		request.setAttribute("skirt", skirt);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/skirt.jsp");
		dispatcher.forward(request, response);
	}

}
