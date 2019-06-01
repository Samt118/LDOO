import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 *
 * @author alext
 */
@WebServlet(urlPatterns = {"/ClaseDeRegistro"})
public class ClaseDeRegistro extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out= response.getWriter();
            String email,password,user,fecha,tipo;
            int clase= 0;
            email=request.getParameter("email");
            password=request.getParameter("password");
            user=request.getParameter("user");
            fecha= request.getParameter("fecha");
            tipo=request.getParameter("tipo");
                
            FabricaUsuarios fab=FabricaUsuarios.getInstance();
            Usuario usuario=fab.getUsuario(user,password,email,fecha,tipo);
            if(tipo.equals("admin")){
                clase= 1;
            }
            else if(tipo.equals("normal")){
                clase= 2;
            }
            else if(tipo.equals("normal")){
                clase= 3;
            }
            
            
            
            switch(clase){
                case 1:
                    out.println("<html>\n" +
                        "    <head>\n" +
                        "        <title>Menu</title>\n" +
                        "        <meta charset=\"UTF-8\">\n" +
                        "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                        "    </head>\n" +
                        "    <body>\n" +
                        "        \n" +
                        "        <div>\n" +
                        "            <h2>Registro Administrador</h2>\n" +
                        "            <form action='LoginAdmin' method='post'>\n" +
                        "                <label>Usuario</label><input type='text' name=\"user\">\n<label>Numero de Empleado</label><input type='text' name=\"nEmpleado\">\n" +
                        "                <input type=\"submit\" value=\"Enviar\">\n" +
                        "            </form>\n" +
                        "            \n" +
                        "        </div>\n" +
                        "    </body>\n" +
                        "</html>");
                    break;
                    
                case 2:
                    out.println("<html>\n" +
                        "    <head>\n" +
                        "        <title>Menu</title>\n" +
                        "        <meta charset=\"UTF-8\">\n" +
                        "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                        "    </head>\n" +
                        "    <body>\n" +
                        "        \n" +
                        "        <div>\n" +
                        "            <h2>Registro Usuario Normal</h2>\n" +
                        "            <form action='LoginNormal' method='post' id=\"registroTipo\">\n" +
                        "                <label>Usuario</label><input type='text' name=\"user\">\n<label>Nombre:</label><input type='text'name=\"nombre\" >\n" +
                        "                <select name=\"subscripcion\" form=\"registroTipo\">\n" +
                        "                    <option>Mensual</option>\n" +
                        "                    <option>Semestral</option>\n" +
                        "                    <option>Anual</option>\n" +
                        "                </select>\n" +
                        "                <label>Domicilio:</label><input type='text'name=\"domicilio\" >\n" +
                        "                <input type=\"submit\" value=\"Enviar\">\n" +
                        "            </form>\n" +
                        "            \n" +
                        "        </div>\n" +
                        "    </body>\n" +
                        "</html>");
                    break;
                
                case 3:
                    out.println("<html>\n" +
                        "    <head>\n" +
                        "        <title>Menu</title>\n" +
                        "        <meta charset=\"UTF-8\">\n" +
                        "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                        "    </head>\n" +
                        "    <body>\n" +
                        "        \n" +
                        "        <div>\n" +
                        "            <h2>Registro Invitado</h2>\n" +
                        "            <form action='LoginInvitado' method='post' id=\"registroTipo\">\n" +
                        "                <label>Usuario</label><input type='text' name=\"user\"><br><label>Nombre:</label><input type='text'name=\"nombre\" >\n" +
                        "                <input type=\"submit\" value=\"Enviar\">\n" +
                        "            </form>\n" +
                        "            \n" +
                        "        </div>\n" +
                        "    </body>\n" +
                        "</html>");
                    break;
            }
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
