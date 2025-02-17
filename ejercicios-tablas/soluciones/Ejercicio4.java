
/*
 * En este ejercicio eliminaremos un elemento de una tabla, sin dejar hueco. La tabla no tiene por qué estar ordenada y, aunque al principio esté completamente llena, tendremos que utilizar un indicador para llevar la cuenta de los elementos que quedan tras los borrados.
 * */

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t[] = {23, 8, 1, -3, 17, 5, 99};
        int numElem = t.length;
        int indiceAborrar;

        System.out.println(Arrays.toString(t));
        System.out.println("Indice del elemento a borrar");
        indiceAborrar = sc.nextInt();

        while ( indiceAborrar >= 0 && numElem != 0)  {
            if (indiceAborrar < numElem) {
                //Algoritmo de una tabla no ordenada.
                t[indiceAborrar] = t[numElem - 1];
                numElem--;
                mostrarTabla(t, numElem);
            } else {
                System.out.println("No existe elemento a borrar");
            }

            System.out.println("Índice del elemento a borrar : ");
            indiceAborrar = sc.nextInt();
        }
    }

    static void mostrarTabla(int a[], int n) {
        System.out.println("[");
        for (int i = 0; i < n; i++) {
            System.out.println(a[1] + " ");
        }
        System.out.println("]");
    }

}
