import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        // Pedimos el DNI
        System.out.print("Introduzca el nº de DNI sin la letra: ");
        int dni = s.nextInt();
        // Calculamos el resto
        int resto = dni%23;
        // Creamos el array con las letras
        String[] list = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        // Damos la letra asociada a la posición que corresponde
        for (int i = 0; i< list.length;i++) {
            if (resto==(i)) {
                    System.out.print("La letra del DNI es: "+list[i]);
            }
        }
    }
}
