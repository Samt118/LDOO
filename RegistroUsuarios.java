package Practica2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegistroUsuarios")
public class RegistroUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegistroUsuarios() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter salida=response.getWriter();
		
		salida.println("<html><body>");
		salida.println("<h1 style='text-align: center'>Registro</h1>");
		salida.println("<br></br>");
		
		salida.println("Nombre introducido: " + request.getParameter("nombre"));
		salida.println("<br></br>");
		
		salida.println("Email introducido: " + request.getParameter("email"));
		salida.println("<br></br>");
		
		salida.println("Contraseņa introducida: " + request.getParameter("contraseņa"));
		salida.println("<br></br>");
		
		salida.println("Esta es la fecha de nacimiento: " + request.getParameter("fecha"));
		salida.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter salida=response.getWriter();
		
		salida.println("<html><body>");
		salida.println("<h1 style='text-align: center'>Registro</h1>");
		salida.println("<br></br>");
		
		salida.println("Nombre introducido: " + request.getParameter("nombre"));
		salida.println("<br></br>");
		
		salida.println("Email introducido: " + request.getParameter("email"));
		salida.println("<br></br>");
		
		salida.println("Contraseņa introducida: " + request.getParameter("contraseņa"));
		salida.println("<br></br>");
		
		salida.println("Esta es la fecha de nacimiento: " + request.getParameter("fecha"));
		salida.println("</body></html>");
	}

}
