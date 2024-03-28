import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Declaramos el array y las variables necesarias
        int[] list = new int[10];
        int positive = 0;
        int negative = 0;
        int zero = 0;

        // Pedimos los números y contamos los tipos de números
        System.out.println("Introduce 10 números: ");
        for(int i = 0; i<list.length; i++) {
            list[i] = s.nextInt();
            if(list[i]>0) {
                positive = positive +1;
            } else if (list[i]<0) {
                negative = negative +1;
            } else {
                zero = zero+1;
            }
        }
        // Imprimimos el resultado
        System.out.println("Hay "+positive+" números positivos");
        System.out.println("Hay "+negative+" números negativos");
        System.out.println("Hay "+positive+" números que son 0");
    }
}
