public class ejercicio10 {
    public static void main(String[] args) {

        // Declaramos la variable day con el número de la semana
        int day = 3;

        /* Comprobamos con if anidados si el numero que contiene la variable day es igual al número
         de la semana y mostramos por pantalla el día de la semana */
        if (day==1) {
            System.out.println("Lunes");
        } else if (day==2) {
            System.out.println("Martes");
        } else if (day==3) {
            System.out.println("Miercoles");
        } else if (day==4) {
            System.out.println("Jueves");
        } else if (day==5) {
            System.out.println("Viernes");
        } else if (day==6) {
            System.out.println("Sábado");
        } else {
            System.out.println("Domingo");
        }
    }
}