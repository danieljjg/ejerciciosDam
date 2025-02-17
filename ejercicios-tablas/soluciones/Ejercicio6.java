/*
*  En este ejercicio leeremos una serie de datos y los ordenaremos. A continuación, realizaremos una inserción ordenada (por cada programador de exhibición). Una mala idea sería insertar al final la puntuación de los programadores de exhibición y volver a ordenar, ya que esto es muy costoso en tiempo. Es mucho más eficiente una inserción ordenada.
* */

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int puntos[] = new int[8];

        for(int i = 0; i < 5; i++) {
            System.out.print("Puntos programador (" + (i + 1) + "):" ) ;
            puntos[i] = sc.nextInt();
        }

        Arrays.sort(puntos, 0, 5);
        System.out.println(Arrays.toString(puntos));

        int numElem = 5;
        System.out.println("Puntos del programador de exhibición: ");

        int puntosProgExh = sc.nextInt();
        while(puntosProgExh != -1 && numElem < puntos.length) {

            int pos = Arrays.binarySearch(puntos, 0, numElem, puntosProgExh);
            int indiceInserccion;

            if (pos < 0) {
                indiceInserccion = -pos -1;
            } else {
                indiceInserccion = pos;
            }

            //Desplazaremos los elementos de la posición pos hasta el final, así haremos un hueco para la puntuación del programador de exhibición.
            for(int i = numElem - 1; i >= indiceInserccion; i--) {
                puntos[i + 1] = puntos[i];
            }

            puntos[indiceInserccion] = puntosProgExh;
            numElem++;

            if(numElem < puntos.length) {
                System.out.print("Puntos del programador de exhibición");
                puntosProgExh = sc.nextInt();
            }
        }

        System.out.println("Puntuación final: ");
        System.out.println(Arrays.toString(puntos));
    }

}
