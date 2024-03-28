import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Declaramos el array y las variables para los tipos de números
        int[] list = new int[10];
        int positive = 0;
        int countPositive = 0;
        int negative = 0;
        int countNegative = 0;

        // Pedimos los números por teclado y los contamos por tipo y sumamos
        System.out.println("Introduce 10 números: ");
        for(int i = 0; i<list.length; i++) {
            list[i] = s.nextInt();
            if(list[i]>0) {
                countPositive = countPositive +1;
                positive = positive + list[i];
            } else if (list[i]<0) {
                countNegative = countNegative +1;
                negative = negative +list[i];
            }
        }
        // Imprimimos la media de los valores por tipos, si existen.
        if ((countPositive)>0) {
            System.out.println("La media de los valores positivos es: " + (double) positive / countPositive);
        } else System.out.println("No hay valores positivos");
        if ((countNegative)>0) {
            System.out.println("La media de los valores negativos es: " + (double) negative / countNegative);
        } else System.out.println("No hay valores negativos");
    }
}
