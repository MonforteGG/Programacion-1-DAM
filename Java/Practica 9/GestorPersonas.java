import java.util.HashMap;
import java.util.Map;

public class GestorPersonas {
    private Map<String, Integer> mapaPersonas;

    public GestorPersonas() {
        this.mapaPersonas = new HashMap<>();
    }

    public Map<String, Integer> getMapaPersonas() {
        return this.mapaPersonas;
    }

    public void setMapaPersonas(Map<String, Integer> mapaPersonas) {
        this.mapaPersonas = mapaPersonas;
    }
    // Agregar personas
    public void agregarPersonas (String nombre, Integer edad) {
        this.mapaPersonas.put(nombre,edad);
    }
    // Mostrar personas
    public void mostrarPersona (String nombre) {
        if (this.mapaPersonas.containsKey(nombre)) {
            System.out.println("Nombre: " + nombre + ", Edad: " + this.mapaPersonas.get(nombre));
        }
        else {
            System.out.println("Esa persona no existe en el mapa");
        }
    }
    // Comprobar personas
    public void personaExiste(String nombre) {
        if (this.mapaPersonas.containsKey(nombre)) {
            System.out.println("Existe");
        }
        else {
            System.out.println("No existe");
        }
    }
}
