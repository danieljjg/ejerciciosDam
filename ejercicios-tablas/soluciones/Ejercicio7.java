/*
* En este ejercicio fusionaremos dos tablas ordenadas(a y b) en una tercera (c), de forma que siga ordenada. Comparamos un elemento de cada tabla, y copiamos el menor en c. El índice correspondiente se incrementará. Hay que tener cuidado cuando se ha copiado todos los elementos de la tabla a o de la tabla b, en este caso, tendremos que copiar el resto de los elementos de la otra tabla en c.
* */

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int TAM = 6;
        int a[] = new int[TAM];

        System.out.println("Escriba la primera serie de números: ");

        for(int i = 0; i < a.length; i++) {
            System.out.println("Introduzca número: ");
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        int b[] = new int[TAM];

        System.out.println("Escriba la segunda serie de números: ");

        for(int i = 0; i < b.length; i++) {
            System.out.println("Introduzca número: ");
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        int[] c = new int[2 * TAM];
        int indA = 0, indB = 0, indC = 0;

        while(indA < TAM && indB < TAM) {

            if(a[indA] < b[indB]) {
                c[indC] = a[indA];
                indA++;
            } else {
                c[indC] = b[indB];
                indB++;
            }
            indC++;

        }

        if(indA == TAM) {
            while(indB < TAM) {
                c[indC] = b[indB];
                indB++;
                indC++;
            }
        } else {
            while(indA < TAM) {
                c[indC] = a[indA];
                indA++;
                indC++;
            }
        }

        System.out.println("Mostramos todos los datos: ");
        System.out.println(Arrays.toString(c));

    }

}
