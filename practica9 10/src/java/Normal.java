/**
 *
 * @author alext
 */
import java.sql.*;
public final class Normal implements Usuario {
    String user,password,email,fecha,nombre,subscripcion,domicilio;
    
    public Normal(String user, String password,String email,String fecha) {
        
        setPassword(password);
        setEmail(email);
        setFecha(fecha);
        setUser(user);
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSubscripcion() {
        return subscripcion;
    }

    public void setSubscripcion(String subscripcion) {
        this.subscripcion = subscripcion;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    
    
    public Normal(String user,String nombre,String subscripcion,String domicilio,String registro){
        this.user=user;
        registrarNormal(nombre,subscripcion,domicilio);
    }
            
    public Normal(String user,String Nombre,String validar) throws ClassNotFoundException, SQLException{
        this.user=user;
        
    }   
            
    @Override
    public void registrarUsuario(){
        try {
            Class.forName(Driver);
            Connection conexion= (Connection) DriverManager.getConnection(url,usuario,contraseña);
            PreparedStatement ps= conexion.prepareStatement("insert into usuarios values('" + user + "','"+password+"','"+ fecha + "','"+ email+"','Normal')");
            ps.executeUpdate();
        } 
        
        catch (ClassNotFoundException E) {
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
    public final void registrarNormal(String nombre, String subscripcion,String domicilio){
        try {
            Class.forName(Driver);
            Connection conexion= (Connection) DriverManager.getConnection(url,usuario,contraseña);
            PreparedStatement ps= conexion.prepareStatement("insert into normal values('" + user + "','"+ nombre+"','"+subscripcion+"','"+domicilio+"')");
            ps.executeUpdate();
        } 
        
        catch(ClassNotFoundException ex) {
            System.out.println("Ha ocurrido un error");
        }
        
        catch(SQLException ex){
            System.out.println("Ha ocurrido un error");
        }
    }
    
    
    
    
}
