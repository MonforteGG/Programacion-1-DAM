public class ejercicio12 {
    public static void main(String[] args) {
        // Declaramos el array y sus valores
        double[][] doub = new double[3][6];
        doub[0][0]= 0;doub[0][1]= 30;doub[0][2]= 2;doub[0][5]= 5;doub[1][0]= 75;doub[1][4]= 0;doub[2][2]= -2;doub[2][3]= 9;doub[2][5]= 11;

        // Imprimimos la tabla
        System.out.printf("%-10s","Array num");
        for(int i = 0;i<6;i++) {
            System.out.printf("%-10s","Columna "+i);
        }
        System.out.println();
        System.out.printf("%-10s","Fila 0");
        for(int j = 0;j<6;j++) {
            System.out.printf("%-10s",(int)doub[0][j]);
        }
        System.out.println();
        System.out.printf("%-10s","Fila 1");
        for(int j = 0;j<6;j++) {
            System.out.printf("%-10s",(int)doub[1][j]);
        }
        System.out.println();
        System.out.printf("%-10s","Fila 2");
        for(int j = 0;j<6;j++) {
            System.out.printf("%-10s",(int)doub[2][j]);
        }
    }
}
