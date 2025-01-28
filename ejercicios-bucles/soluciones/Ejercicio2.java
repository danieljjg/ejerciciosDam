
// Como no sabemos cuántas edades se van a utilizar como datos, utilizaremos un bucle while. En cada iteración acumularemos la edad, incrementaremos un contador para llevar la cuenta de las edades introducidas y dependiendo si el alumno es mayor de edad, incrementaremos el contador de alumnos mayores de edad.
// Cuando salgamos del bucle mostraremos los datos y calcularemos la media.

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaEdades = 0;
        int contadorAlumnos = 0, contadorMayorEdad = 0;
        double media;
        int edad;

        System.out.print("Introduzca edad: ");
        edad = sc.nextInt();

        while(edad >= 0) {
            sumaEdades += edad;
            contadorAlumnos++;

            if(edad >= 18) {
                contadorMayorEdad++;
            }
            System.out.print("Introduzca edad: ");
            edad = sc.nextInt();
        }

        media = (double) sumaEdades / contadorAlumnos;

        System.out.println("Suma de todas las edades: " + sumaEdades);
        System.out.println("Media: " + media);

        System.out.println("Número total de alumnos: " + contadorAlumnos);
        System.out.println("Mayores de edad: " + contadorMayorEdad);


    }

}
