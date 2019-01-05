package com.tecsup.javawebavanzado.sesion01.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tecsup.javawebavanzado.sesion01.ejb.CalculadoraEJB;
import com.tecsup.javawebavanzado.sesion01.ejb.ContadorEJB;
import com.tecsup.javawebavanzado.sesion01.ejb.PropiedadEJB;

/**
 * Servlet implementation class EjemploServletEJB
 */
@WebServlet("/EjemploSevletEJB")
public class EjemploServletEJB extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@javax.ejb.EJB
    CalculadoraEJB calcEJB;   
	
	@javax.ejb.EJB
	ContadorEJB cont;

	@javax.ejb.EJB
	ContadorEJB cont2;

	@javax.ejb.EJB
	PropiedadEJB prop;
	
	@javax.ejb.EJB
	PropiedadEJB prop2;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EjemploServletEJB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int sum=calcEJB.sumar(3,4);
		response.getWriter().append("Suma: ").append(""+sum);
		
		PrintWriter out = 
				response.getWriter();
		
		cont.incrementar();
		prop.setMensaje("Hola Mundo ...!");
		prop2.setMensaje("Hola Mundo2 ...!");
		
//		out.println("----------");
//		out.println("<BR>");		
//		out.println("Suma =" + calc.sumar(3, 4));
//		out.println("<BR>");
		out.println("----------");
		out.println("<BR>");
		out.println("Contador1 =" + cont.getCont());
		out.println("<BR>");
		out.println("Contador2 =" + cont2.getCont());
		out.println("<BR>");
		out.println("----------");
		out.println("<BR>");
		out.println("Mensaje1 =" + prop.getMensaje());
		out.println("<BR>");
		out.println("Mensaje2 =" + prop2.getMensaje());
		out.println("<BR>");		
		out.println("----------");
		out.println("<BR>");
		

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
