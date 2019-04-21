

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


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
        Usuario usuario= new Usuario(request.getParameter("Nombre"), request.getParameter("Contrasena"), request.getParameter("Email"));
        HttpSession sesion= request.getSession();
        sesion.setAttribute("usuario",usuario);
        Cookie cookie= new Cookie("idsession", sesion.getId());
        response.addCookie(cookie);
        
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>");
        out.println("Ya estas registrado!" + ((Usuario)(sesion.getAttribute("usuario"))).getEmail()+ ((Usuario)(sesion.getAttribute("usuario"))).getPass());
        out.println("</h1>");
        out.println("<a href=Login.html>");
        out.println("Ir a login");
        out.println("</a>");
        out.println("</body>");
        out.println("</html>");
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
