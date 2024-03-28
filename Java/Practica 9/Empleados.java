public class Empleados {
    private String nombre;
    private Double salary;

    public Empleados(String nombre, Double salary) {
        this.nombre = nombre;
        this.salary = salary;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
