import java.util.HashSet;
import java.util.Set;

public class GestorColores {
    private Set<String> setColores;

    public GestorColores() {
        this.setColores = new HashSet<>();
    }

    // Getter
    public Set<String> getSetColores() {
        return this.setColores;
    }
    // Setter
    public void setSetColores(Set<String> setColores) {
        this.setColores = setColores;
    }
    // Añadir un color
    public void agregarColor(String color) {
        this.setColores.add(color);
    }
    public void verificarColor(String color) {
    if (this.setColores.contains(color)) {
        System.out.println("Existe");
    } else {
        System.out.println("No existe");
    }
}
}
