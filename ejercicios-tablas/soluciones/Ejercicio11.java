public class Ejercicio11 {

    public static void main(String[] args) {

        int t[][];
        t = new int[5][5];

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                t[i][j] = i + j;
            }
        }

        System.out.println("Tabla: ");
        for(int i = 4; i >= 0; i--) { // Mostamos las filas al reves, como las matrices
            System.out.println();
            for(int j = 0; j < 5; j++) {
                System.out.println(t[i][j] + " ");
            }
        }

    }

}
