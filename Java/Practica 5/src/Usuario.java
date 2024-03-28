public class Usuario {

    // Atributos
    private String nombre;
    private String apellidos;
    private int cp;
    private String direccion;
    private String email;
    private String contraseña;

    // Constructor

    public Usuario(String nombre, String apellidos, int cp, String direccion, String email, String contraseña) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cp = cp;
        this.direccion = direccion;
        this.email = email;
        this.contraseña = contraseña;
    }

    // Getter and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    // Método check
    public void checkAccount(String email, String password) {

        if (this.email.equals(email) && this.contraseña.equals(password)) {
            System.out.println("Login correcto");
        }
        else {
            System.out.println("La cuenta introducida no es correcta");
        }
    }
}
