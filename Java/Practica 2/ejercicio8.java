import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double sum = 0;
        double average = 0;
        int mayor = 0;
        int minor = 0;

        // Pedimos el número de alturas
        System.out.println("Introduce con cuantas alturas vamos a trabajar: ");
        int size = s.nextInt();

        // Forzamos que solo sean datos positivos
        while (size<0) {
            System.out.println("Introduce datos positivos: ");
            size = s.nextInt();
        }

        // Declaramos el array de tamaño size y pedimos las alturas por teclado
        double[] list = new double[size];
        System.out.println("Introduzca las diferentes alturas: ");

        // Rellenamos el array y sumamos las alturas
        for (int i = 0; i < list.length; i++) {
            list[i] = s.nextDouble();
            sum = sum + list[i];
        }
        // Calculamos la media
        average = sum / size;

        // Calculamos cuantas personas tienen una altura superior o inferior a la media
        for (int o = 0; o < list.length; o++) {
            if (list[o] > average) {
                mayor = mayor + 1;
            } else if (list[o] < average) {
                minor = minor + 1;
            }
        }
        // Imprimimos los resultados
        System.out.println("Hay "+mayor+" personas con altura mayor que la media.");
        System.out.println("Hay "+minor+" personas con altura menor que la media.");
    }
}
