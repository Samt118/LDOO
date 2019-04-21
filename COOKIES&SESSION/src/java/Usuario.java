public class Usuario {
    private String nombre;
    private String pass;
    private String email;

    public Usuario(String nombre, String pass, String email) {
        this.nombre = nombre;
        this.pass = pass;
        this.email= email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   

    public String getNombre() {
        return nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
