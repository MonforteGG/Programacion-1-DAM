import java.util.ArrayList;


public class GestorNumeros {
    private ArrayList<Integer> listaNumeros;

    public GestorNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    // Getter
    public ArrayList<Integer> getListaNumeros() {
        return listaNumeros;
    }
    // Setter
    public void setListaNumeros(ArrayList<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }
    // Método para añadir un número
    public void agregarNumero (int numero) {
        listaNumeros.add(numero);
    }
    // Método para sumar números
    public int sumarNumeros () {
        int sum = 0;
        for (int i = 0;i<listaNumeros.size();i++) {
            sum = sum + listaNumeros.get(i);
        }
        return sum;
    }
}
