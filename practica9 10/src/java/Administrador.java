/**
 *
 * @author alext
 */
import java.sql.*;
public final class Administrador implements Usuario{
 String user, password, email, fecha, noEmpleado;
 
public Administrador(String user, String password, String email, String fecha){

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNoEmpleado() {
        return noEmpleado;
    }

    public void setNoEmpleado(String noEmpleado) {
        this.noEmpleado = noEmpleado;
    }


public Administrador(String user,String nEmpleado){
        this.user=user;
        registrarAdministrador(user,nEmpleado);
    }
    public Administrador(String user,String password,String validar) throws ClassNotFoundException, SQLException {
        this.password=password;
        this.user=user;
        
    }

    @Override
    public void registrarUsuario() {
       
    try {
            Class.forName(Driver);
            Connection conexion= (Connection) DriverManager.getConnection(url,usuario,contraseña);
            PreparedStatement myStat= conexion.prepareStatement("insert into usuarios values('" + user + "','"+password+"','"+ fecha + "','"+ email+"','Administrador')");
            myStat.executeUpdate();
        } 
    
        catch (SQLException E) {
            System.out.println("Ha ocurrido un error");
        }
    
        catch(ClassNotFoundException E){
            System.out.println("Ha ocurrido un error");
        }
    }
    

    @Override
    public String validarUsuario() throws ClassNotFoundException, SQLException {
        
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
    
    public void registrarAdministrador(String user,String nEmpleado){
        try {
            Class.forName(Driver);
            Connection conexion= (Connection) DriverManager.getConnection(url,usuario,contraseña);
            PreparedStatement ps= conexion.prepareStatement("insert into admin values('" + user + "','"+ noEmpleado+"')");
            ps.executeUpdate();
        } 
        
        catch (ClassNotFoundException E) {
            System.out.println("Ha ocurrido un error");
        }
        
        catch(SQLException E){
            System.out.println("Ha ocurrido un error");
        }
        
    }
    public String validarAdmin() throws SQLException, ClassNotFoundException{
        
            String salida="";
            Class.forName(Driver);
            Connection conexion= (Connection) DriverManager.getConnection(url,usuario,contraseña);
            Statement sentencia=conexion.createStatement();
            ResultSet resultado= sentencia.executeQuery("select * from admin where Usuario='"+user+"'");
            while(resultado.next()){
                salida=resultado.getString("Empleado");
            }
            
            
            return salida;
    }
    
}
