
import java.sql.*;

public class Conexión {
    
    public static String url="jdbc:mysql://localhost:3306/datos";
    public static String user="root";
    public static String password="";
    public static String nombre="";
    public static String email="";
    public static String contrasena="";
    public static String fecha="";
    public static String out="";

    public Conexión(String nombre, String email, String contrasena, String fecha) {
        setNombre(nombre);
        setEmail(email);
        setContrasena(contrasena);
        setFecha(fecha);
       
    }
    
    public Conexión(){
    
    }
    
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public void setEmail(String email){
        this.email= email;
    }
    
    public void setContrasena(String contrasena){
        this.contrasena= contrasena;
    }
    
    public void setFecha(String fecha){
        this.fecha= fecha;
    }

    public static String getNombre() {
        return nombre;
    }

    public static String getEmail() {
        return email;
    }

    public static String getContrasena() {
        return contrasena;
    }

    public static String getFecha() {
        return fecha;
    }
    
    public String registro(){
        
    try{
        
        Class.forName("com.mysql.jdbc.Driver");
        //1. Get a connection to a database.
        Connection myConn= DriverManager.getConnection(url, user, password);
        //2. Create a statement.
        Statement myStat = myConn.createStatement();
        //3. Execute SQL query.
        String sql = "insert into usuarios"
                   + "(Nombre, Email, Contrasena, Fecha)"
                   + "values('"+nombre+"' , '"+email+"' , '"+contrasena+"', '"+fecha+"')";
        
        myStat.executeUpdate(sql);
        System.out.println("Insert complete");
        }
        catch(Exception e){
            out = String.format("Error:%s", e.getMessage());
        }
       return out;
    }
    
    public String[] obtenerEmail(){
        
        String [] datos= new String[10];
        
        
        try{
             Class.forName("com.mysql.jdbc.Driver");
             //1. Get a connection to a database.
             Connection myConn= DriverManager.getConnection(url, user, password);
             //2. Create a statement.
             Statement myStat = myConn.createStatement();
             //3. Execute SQL query.
             ResultSet myRs = myStat.executeQuery("select * from usuarios");
             //4. Return values.
              while (myRs.next()){
              datos[0]= myRs.getString("Email");
              datos[1]= myRs.getString("Contrasena");
            }
           
        }
        catch(Exception e){
        }
        return datos;
        
        
    }
    
       
}
