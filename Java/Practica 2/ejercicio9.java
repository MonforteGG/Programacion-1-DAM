import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Creamos el array bidimensional con nombres y notas
        String[][] array = {{"Alberto Díaz","10"},{"Pablo Ramirez","8"},{"Jaime García","7,5"},{"Jesús Sánchez","7"}};

        // Pedimos el nombre
        System.out.println("Introduce tu nombre y primer apellido para saber tu nota: ");
        String name = s.nextLine();
        String res = "Ese alumno no existe.";
        // Buscamos su nota
        for (int i = 0; i< array.length; i++) {
            if (name.equals(array[i][0])) {
                res =array[i][1];
            }
        }
        // Imprimimos resultado
        System.out.println(res);
    }
}
