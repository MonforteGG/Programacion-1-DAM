public class ejercicio1 {
    public static void main(String[] args) {

        // Declaramos las variables
        int x = 144;
        int y = 999;

        // Declaramos las variables de las operaciones
        int add = x + y;
        int subtract = x - y;
        int multiplication = x*y;
        double division = (double)x/y;
        double division2 = (double)y/x;

        // Mostramos por pantalla el resultado de las operaciones
        System.out.println("El valor de x es: " +x);
        System.out.println("El valor de y es: " +y);
        System.out.println("El valor de x + y es: " + add);
        System.out.println("El valor de x - y es: " + subtract);
        System.out.println("El valor de x * y es: " + multiplication);
        System.out.println("El valor de y/x es: " + division2);
        System.out.println("El valor de x/y es: " + division);
    }
}
