import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Longitud de la combinación secreta: ");
        int longitud = sc.nextInt();

        int combSecreta[] = new int[longitud];
        int combJugador[] = new int[longitud];

        generaCombinacion(combSecreta);
        System.out.println(Arrays.toString(combSecreta));
        System.out.println("Escriba una combinación");
        leerTabla(combJugador);

        while(!Arrays.equals(combSecreta, combJugador)) {
            muestraPistas(combSecreta, combJugador);
            System.out.println("Escriba una combinación");
            leerTabla(combJugador);
        }

        System.out.println("La camara esta abierta");

    }

    static void generaCombinacion(int t[]) {
        final int MAX = 5;

        for(int i = 0; i < t.length; i++) {
            t[i] = new Random().nextInt(MAX + 1);
        }
    }

    static void leerTabla(int t[]) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }

    }

    static void muestraPistas(int secret[], int jug[]) {

        for(int i = 0; i < jug.length; i++) {
            System.out.println(jug[i]);
            if(secret [i] > jug[i]) {
                System.out.println("mayor");
            } else if(secret[i] < jug[1]) {
                System.out.println("menor");
            } else {
                System.out.println("igual");
            }
        }

    }

}
