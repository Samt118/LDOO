import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


/**
 *
 * @author alext
 */
@WebServlet(urlPatterns = {"/InicioAdmin"})
public class InicioAdmin extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try {
            String userVerificación,passwordVerificación,nEmpleadoVerificación,clave,numero;
            userVerificación=request.getParameter("user");
            nEmpleadoVerificación=request.getParameter("nEmpleado");
            passwordVerificación=request.getParameter("password");
            Administrador admin=new Administrador(userVerificación,nEmpleadoVerificación,passwordVerificación);
            clave=admin.validarUsuario();
            numero=admin.validarAdmin();
            PrintWriter out= response.getWriter();
            if(numero.equals(nEmpleadoVerificación) ){
                if(clave.equals(passwordVerificación)){
                    out.println("<!DOCTYPE html>\n" +
                    "<!--\n" +
                    "To change this license header, choose License Headers in Project Properties.\n" +
                    "To change this template file, choose Tools | Templates\n" +
                    "and open the template in the editor.\n" +
                    "-->\n" +
                    "<html>\n" +
                    "    <head>\n" +
                    "        <title>Bienvenido</title>\n" +
                    "        <meta charset=\"UTF-8\">\n" +
                    "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "    </head>\n" +
                    "    <body>\n" +
                    "        \n" +
                    "        <div>\n" +
                    "            <h1>Bienvenido Administrador "+numero+"</h1>\n" +
                    "        </div>\n" +
                    "    </body>\n" +
                    "</html>\n" +
                    "");
                }else{
                    out.println("<html>\n" +
                        "    <head>\n" +
                        "        <title>Log In</title>\n" +
                        "        <meta charset=\"UTF-8\">\n" +
                        "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                        "    </head>\n" +
                        "    <body>\n" +
                        "        <p>Contrasena Incorrecta</p><br><h1>Inicio de Sesion</h1>\n" +
                        "        \n" +
                        "        <div>\n" +
                        "            <form action=\"ExitoAdmin\" method=\"post\">\n" +
                        "                <label>Usuario:</label><input type=\"text\" name=\"user\"/><br><label>Numero de empleado:</label><input type=\"text\" name=\"nEmpleado\"/><br>\n" +
                        "                <label>Contraseña:</label><input type=\"password\" name=\"password\"/><br>\n" +
                        "                <input type=\"submit\" value=\"Enviar\"/ name=\"Enviar\"/>  \n" +
                        "            </form>\n" +
                        "        </div>\n" +
                        "    </body>\n" +
                        "</html>\n" +
                        "");
                
                }
            }else{
                out.println("<html>\n" +
                    "    <head>\n" +
                    "        <title>Log In</title>\n" +
                    "        <meta charset=\"UTF-8\">\n" +
                    "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "    </head>\n" +
                    "    <body>\n" +
                    "        <p>Error Inicio de Sesion</p><br><h1>Inicio de Sesion</h1>\n" +
                    "        \n" +
                    "        <div>\n" +
                    "            <form action=\"ExitoAdmin\" method=\"post\">\n" +
                    "                <label>Usuario:</label><input type=\"text\" name=\"user\"/><br><label>Numero de empleado:</label><input type=\"text\" name=\"nEmpleado\"/><br>\n" +
                    "                <label>Contraseña:</label><input type=\"password\" name=\"password\"/><br>\n" +
                    "                <input type=\"submit\" value=\"Enviar\"/ name=\"Enviar\"/>  \n" +
                    "            </form>\n" +
                    "        </div>\n" +
                    "    </body>\n" +
                    "</html>\n" +
                    "");
                        
            
            }
            
            
            
            
        } 
         
        catch (ClassNotFoundException E) {
            System.out.println("Ha ocurrido un error");
        }
        
        catch(SQLException E){
           System.out.println("Ha ocurrido un error");
        }
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
