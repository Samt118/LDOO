
import java.sql.SQLException;

/**
 *
 * @author alext
 */
public interface Usuario {
    public static final String url="jdbc:mysql://localhost:3306/usuarios";
    public static final String usuario="root";
    public static final String contraseña="";
    public static final String Driver="com.mysql.jdbc.Driver";
    void registrarUsuario();
    String validarUsuario()throws ClassNotFoundException, SQLException;
    
}
