public class ejercicio10 {
    public static void main(String[] args) {

        // Declaramos el array con los valores, y otro para su inverso
        int[] list = {4,5,6,7,8,9};
        int reverse[] = new int[6];

        // Metemos los valores de uno a otro en orden inverso
        for (int i = 0; i<list.length;i++) {
            reverse[5-i] = list[i];
        }
        // Imprimimos el resultado
        for (int i =0; i<list.length;i++) {
            System.out.print(reverse[i] + " ");
        }
    }
}
