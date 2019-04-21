
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/Registro"})
public class Registro extends HttpServlet {
    

 

    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        
        String nombre= request.getParameter("Nombre");
        String email= request.getParameter("Email");
        String contrasena= request.getParameter("Contrasena");
        String fecha= request.getParameter("Fecha");
        
        
        Conexión conector = new Conexión(nombre, email, contrasena, fecha);
        conector.registro();
        
        
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>");
        out.println("Ya estas registrado!" + "," + Conexión.getNombre() + "," + Conexión.getEmail() + "," + Conexión.getContrasena() + ","+ Conexión.getFecha());    
        out.println("</h1>");
        out.println("<a href= LogIn.html>");
        out.println("Ir a LogIn");
        out.println("</a>");
        out.println("</body>");
        out.println("</html>");
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
