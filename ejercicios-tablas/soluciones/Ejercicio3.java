import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int numeros[];
        int sumaPositivos = 0,
                contPositivos = 0,
                sumaNegativos = 0,
                contNegativos = 0,
                contCeros = 0;

        System.out.print("Cuántos números vas a introducir: ");
        n = sc.nextInt();
        numeros = new int[n];

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Introduzca un número: ");
            numeros[i] = sc.nextInt();
        }

        // Procesamos los datos utilizando un for-each.

        for(int x : numeros) {
            if (x == 0) {
                contCeros ++;
            } else {
                if (x > 0) {
                    sumaPositivos += x;
                    contPositivos++;
                } else {
                    sumaNegativos += x;
                    contNegativos++;
                }
            }
        }

        // Al hacer las medias hay que tener cuidado de no realizar una división por cero.

        if (contPositivos == 0) {
            System.out.println("Imposible realizar la media de los positivos");
        } else {
            System.out.println("Media de los positivos: " + (double) sumaPositivos / contPositivos);
        }

        if (contNegativos == 0) {
            System.out.println("Imposible realizar la media de los negativos");
        } else {
            System.out.println("Media de los negativos : " + (double) sumaNegativos / contNegativos);
        }

        System.out.println("Cantidad de ceros: " + contCeros);

    }

}
