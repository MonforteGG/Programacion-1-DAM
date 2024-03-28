import java.util.HashSet;

public class GestorEstudiantes {
    private HashSet<Estudiantes> setEstudiantes;
    // Constructor
    public GestorEstudiantes() {
        this.setEstudiantes = new HashSet<Estudiantes>();
    }
    // Getter
    public HashSet<Estudiantes> getSetEstudiantes() {
        return this.setEstudiantes;
    }
    // Setter
    public void setSetEstudiantes(HashSet<Estudiantes> setEstudiantes) {
        this.setEstudiantes = setEstudiantes;
    }

    public void agregarEstudiante(Estudiantes estudiante) {
        this.setEstudiantes.add(estudiante);
    }

    public void mostrarLista() {
        for (Estudiantes estudiante : this.setEstudiantes) {
            System.out.println(estudiante.getNombre());
        }
    }

    public void comprobarEstudiante(String nombre) {
        for (Estudiantes estudiante : this.setEstudiantes) {
            if (nombre.equals(estudiante.getNombre())) {
                System.out.println("Existe");
                return;
            }
        }
        System.out.println("No existe");
    }
}
