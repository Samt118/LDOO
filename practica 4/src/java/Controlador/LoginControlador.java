
package Controlador;

import Modelo.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.SimpleFormController;

/**
 *
 * @author alext
 */
public class LoginControlador extends SimpleFormController{
    
    public LoginControlador(){
        setCommandClass(User.class);
        setCommandName("LoginUser");
        
    }

    @Override
    protected ModelAndView onSubmitRender(Object command) throws Exception {
        User user= (User) command;
        ModelAndView nav;
        if(user.getNombre().equals("test") && user.getContrasena().equals("test")){
           return nav= new ModelAndView("Bienvenido", "user", user);
        }
        return nav= new ModelAndView("Login", "user", user);
    }
    
    
    
    
    
}
