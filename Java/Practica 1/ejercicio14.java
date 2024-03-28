public class ejercicio14 {
    public static void main(String[] args) {

        System.out.println("Los números del 320 al 160, contando de 20 en 20 hacia atrás son: ");

        /* Mostramos por pantalla los multiplos de 20 entre el 320 y el 160, de forma descendente.
         Es mediante un bucle for que empieza en 320 y desciende 20 unidades cada vez, hasta llegar a 160 */
        for (int multiple=320; multiple>= 160; multiple=multiple-20) {
            System.out.print(multiple+",");
        }
    }
}