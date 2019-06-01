
/**
 *
 * @author alext
 */
import java.sql.*;
public final class Invitado implements Usuario{
    String user,password,nombre,fecha,email;
    
    public Invitado(String user, String password,String email,String fecha) {
        
        setPassword(password);
        setEmail(email);
        setFecha(fecha);
        setUser(user);
        registrarUsuario();
        
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public Invitado(String user,String password){
        this.user=user;
        this.password=password;
        
    }
    
    public Invitado(String user,String nombre,String fecha) throws ClassNotFoundException, SQLException {
        this.user=user;
        this.nombre=nombre;
        this.fecha=fecha;
        
    }
    @Override
    public void registrarUsuario(){
        try {
            Class.forName(Driver);
            Connection conexion= (Connection) DriverManager.getConnection(url,usuario,contraseña);
            PreparedStatement ps= conexion.prepareStatement("insert into usuarios values('" + user + "','"+password+"','"+ fecha + "','"+ email+"','Invitado')");
            ps.executeUpdate();
        } 
        
        catch(ClassNotFoundException E) {
            System.out.println("Ha ocurrido un error");
        }
        
        catch(SQLException E){
            System.out.println("Ha ocurrido un error");
        }
        
    }
    
    @Override
    public String validarUsuario()throws ClassNotFoundException, SQLException{
       
            String salida="";
            Class.forName(Driver);
            Connection conexion= (Connection) DriverManager.getConnection(url,usuario,contraseña);
            Statement sentencia=conexion.createStatement();
            ResultSet resultado= sentencia.executeQuery("select * from usuarios where Username='"+user+"'");
            while(resultado.next()){
                salida=resultado.getString("password");
            }
            return salida;
        
    }
    
    public void registrarInvitado(String nombre, String fRegistro){
        try {
            Class.forName(Driver);
            Connection conexion= (Connection) DriverManager.getConnection(url,usuario,contraseña);
            PreparedStatement ps= conexion.prepareStatement("insert into invitado values('" + user + "','"+ nombre+"','"+fRegistro+"')");
            ps.executeUpdate();
        } 
        
        catch(ClassNotFoundException E) {
            System.out.println("Ha ocurrido un error");
        }
        
        catch(SQLException E){
            System.out.println("Ha ocurrido un error");
        }
    }
    
    
}
