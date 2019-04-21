

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns = {"/LogIn"})
public class LogIn extends HttpServlet {

 
   

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion= request.getSession();
        Usuario usuario = (Usuario)sesion.getAttribute("usuario");
        String emailregistrado= usuario.getEmail();
        String passwordregistrado= usuario.getPass();
        Cookie[] cookie = request.getCookies();
        String idSesionCookie= cookie[0].getValue();
        String sessionid = sesion.getId();
        PrintWriter out= response.getWriter();
        
        String emailLogIn= request.getParameter("Email");
        String contraseñaLogIn= request.getParameter("Contrasena");
        
        if(emailLogIn.equals(emailregistrado)){
            if(contraseñaLogIn.equals(passwordregistrado)){
                if(sessionid.equals(idSesionCookie)){
                    out.println("<html>\n" +
"    <head>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    </head>\n" +
"    <body>\n" +
"        \n" +
"            <h1>Bienvenido!!</h1>\n" +                        

"  \n" +
"           <form action=\"Expirar\" method=\"post\"> \n" +
"               \n" +
"                <input type=\"submit\" value=\"Expirar sesión\">\n" +
"            \n" +
"        </form>\n" +
"    </body>\n" +
"</html>");
                }else{
                out.println("<html>\n" +
"    <head>\n" +
"        <title>LogIn</title>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    </head>\n" +
"    <body>\n" +
"        \n" +
"            <h1>Ha ocurrido un error</h1>\n" +                        
"            <h2>LogIn</h1>\n" +
"            <h3>Introduce tu usuario</h2>\n" +
"  \n" +
"           <form action=\"LogIn\" method=\"post\"> \n" +
"               \n" +
"               <label for=\"Email\">Email</label>\n" +
"               <input type=\"email\" id=\"Email\" name= \"Email\" placeholder=\"Escribe tu email\">\n" +
"                \n" +
"                <label for=\"Contraseña\">Contraseña</label>\n" +
"		<input type= \"password\" id=\"contraseña\" name=\"Contrasena\" placeholder=\"Escribe tu contraseña\">\n" +
"                \n" +
"                <input type=\"submit\" value=\"Enviar\">\n" +
"            \n" +
"        </form>\n" +
"    </body>\n" +
"</html>");}
            }  else{ out.println("<html>\n" +
"    <head>\n" +
"        <title>LogIn</title>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    </head>\n" +
"    <body>\n" +
"        \n" +
"            <h1>Contraseña incorrecta</h1>\n" +                    
"            <h2>LogIn</h1>\n" +
"            <h3>Introduce tu usuario</h2>\n" +
"  \n" +
"           <form action=\"LogIn\" method=\"post\"> \n" +
"               \n" +
"               <label for=\"Email\">Email</label>\n" +
"               <input type=\"email\" id=\"Email\" name= \"Email\" placeholder=\"Escribe tu email\">\n" +
"                \n" +
"                <label for=\"Contraseña\">Contraseña</label>\n" +
"		<input type= \"password\" id=\"contraseña\" name=\"Contrasena\" placeholder=\"Escribe tu contraseña\">\n" +
"                \n" +
"                <input type=\"submit\" value=\"Enviar\">\n" +
"            \n" +
"        </form>\n" +
"    </body>\n" +
"</html>");} 
                
        }else{out.println("<html>\n" +
"    <head>\n" +
"        <title>LogIn</title>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    </head>\n" +
"    <body>\n" +
"        \n" +
"            <h1>Usuario no encontrado</h1>\n" +
"            <h2>LogIn</h1>\n" +
"            <h3>Introduce tu usuario</h2>\n" +
"  \n" +
"           <form action=\"LogIn\" method=\"post\"> \n" +
"               \n" +
"               <label for=\"Email\">Email</label>\n" +
"               <input type=\"email\" id=\"Email\" name= \"Email\" placeholder=\"Escribe tu email\">\n" +
"                \n" +
"                <label for=\"Contraseña\">Contraseña</label>\n" +
"		<input type= \"password\" id=\"contraseña\" name=\"Contrasena\" placeholder=\"Escribe tu contraseña\">\n" +
"                \n" +
"                <input type=\"submit\" value=\"Enviar\">\n" +
"            \n" +
"        </form>\n" +
"    </body>\n" +
"</html>");}   
        
    }
    
}
        
        
        
    

    
    


