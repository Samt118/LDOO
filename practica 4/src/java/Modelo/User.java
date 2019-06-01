package Modelo;

/**
 *
 * @author alext
 */
public class User {
    private String Nombre;
    private String Fecha;
    private String Email;
    private String Contrasena;
    
    public User (String Nombre, String Fecha, String Email, String Contrasena){

        setNombre(Nombre);
        setFecha(Fecha);
        setEmail(Email);
        setContrasena(Contrasena);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }
    
    
    
    
    
}
