public class ejercicio3 {
    public static void main(String[] args) {

        // Declaramos el array
        int[] array = {8, 5, 2, 7, 3};
        // Declaramos la posición 0 del array
        int initialPos = array[0];
        //Comparamos los valores para obtener el mas pequeño
        for (int i = 0; i < array.length; i++) {
            if (initialPos > array[i]) {
                initialPos = array[i];
            }
        }
        // Imprimimos el resultado
        System.out.println(initialPos);
    }
}
