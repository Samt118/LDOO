import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alext
 */
@WebServlet(urlPatterns = {"/LoginInvitado"})
public class LoginInvitado extends HttpServlet {
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out= response.getWriter();
        String user,nombre,fecha;
        Date registro;
        user=request.getParameter("user");
        nombre=request.getParameter("nombre");
        registro=new Date();
        fecha=registro.toString();
        if(nombre!= null){
                
            try {
                Invitado invitado=new Invitado(user,nombre,fecha);
               invitado.registrarInvitado(nombre,fecha);
            } catch (SQLException ex) {
                Logger.getLogger(LoginInvitado.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginInvitado.class.getName()).log(Level.SEVERE, null, ex);
            }
                
        }
                out.println("<html>\n" +
                    "    <head>\n" +
                    "        <title>Log In</title>\n" +
                    "        <meta charset=\"UTF-8\">\n" +
                    "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "    </head>\n" +
                    "    <body>\n" +
                    "        <h1>Inicio de Sesion</h1>\n" +
                    "        \n" +
                    "        <div>\n" +
                    "            <form action=\"InicioInvitado\" method=\"post\">\n" +
                    "                <label>Usuario:</label><input type=\"text\" name=\"user\"/><br>\n" +
                    "                <label>Contraseña:</label><input type=\"password\" name=\"password\"/><br>\n" +
                    "                <input type=\"submit\" value=\"Enviar\"/ name=\"Enviar\"/>  \n" +
                    "            </form>\n" +
                    "        </div>\n" +
                    "    </body>\n" +
                    "</html>\n" +
                    ""); 
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
