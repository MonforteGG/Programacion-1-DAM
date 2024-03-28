import java.util.HashMap;

public class GestorEmpleados {
    private HashMap<String, Empleados> mapaEmpleados;

    // Constructor
    public GestorEmpleados() {
        this.mapaEmpleados = new HashMap<String, Empleados>();
    }

    // Getter
    public HashMap<String, Empleados> getMapaEmpleados() {
        return mapaEmpleados;
    }
    // Setter
    public void setMapaEmpleados(HashMap<String, Empleados> mapaEmpleados) {
        this.mapaEmpleados = mapaEmpleados;
    }
    // Agregar Empleado
    public void agregarEmpleado(String dni, Empleados empleado) {
        this.mapaEmpleados.put(dni,empleado);
    }
    // Mostrar Empleado
    public void mostrarEmpleado(String dni) {
        if (this.mapaEmpleados.containsKey(dni)) {

            Empleados emp = this.mapaEmpleados.get(dni);
            System.out.println("El empleado con DNI " + dni + " se llama " + emp.getNombre() + " y su salario es de " + emp.getSalary());
        }
    }
    // Comprobar Empleado
    public void comprobarEmpleado(String dni) {
        if (mapaEmpleados.containsKey(dni)) {
            System.out.println("El empleado existe dentro del diccionario");
        }
        else {
            System.out.println("El empleado no existe dentro del mapa");
        }
    }
}
