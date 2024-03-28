
public class Medico {
    private double salario;
    private String nombre;
    private String dni;
    private Integer edad;
    private String sexo;

    public Medico(double salario, String nombre, String dni, Integer edad, String sexo) {
        this.salario = salario;
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String mostrarMedico() {
        return "Medico{" +
                "salario=" + this.salario +
                ", nombre='" + this.nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
