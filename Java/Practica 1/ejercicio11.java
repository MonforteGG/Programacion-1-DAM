import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {

        // Llamamos al scanner en la variable s
        Scanner s = new Scanner(System.in);

        // Pedimos por teclado que introduzca 3 números
        System.out.println("Este programa ordena 3 numeros que introduzcas");
        System.out.println("Introduce el primer número");
        int x = s.nextInt();
        System.out.println("Introduce el segundo número");
        int y = s.nextInt();
        System.out.println("Introduce el tercer número");
        int z = s.nextInt();

        // Comprobamos con if anidados el el tamaño y los devolvemos por pantalla ordenados
        if ((x > y) && (x > z)) {
            if (y > z) {
                System.out.println("El orden correcto es " +x+"," +y+","+z);
            } else {
                System.out.println("El orden correcto es " +x+","+z+","+y);
            }
        } else if ((y > x) && (y > z)) {
            if (x > z) {
                System.out.println("El orden correcto es " +y+","+x+","+z);
            } else {
                System.out.println("El orden correcto es " +y+","+z+","+x);
            }
        } else if ((z > x) && (z > y)) {
            if (x > y) {
                System.out.println("El orden correcto es " +z+","+x+","+y);
            } else {
                System.out.println("El orden correcto es " +z+","+y+","+x);
            }
        }
    }
}