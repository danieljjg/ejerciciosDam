import java.util.Arrays;

public class Ejercicio12 {

    public static void main(String[] args) {

        int combinacioGanadora[] = {3, 13, 25, 33, 41, 48}; // Lo ideal seria introducirlos por teclado o generarlos aleatoriamente, con ambos arrays.
        int apuesta[] = {2, 25, 41, 42, 45, 49};

        System.out.println("Aciertos: " + primitiva(combinacioGanadora, apuesta));

    }

    static int primitiva(int[] combinacioGanadora, int[] apuesta) {
        int aciertos = 0;

        for(int comb : combinacioGanadora) {

            if(Arrays.binarySearch(apuesta,comb) >= 0) {
                aciertos++;
            }

        }

        return aciertos;
    }

}
