import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        int anioActual;
        int anioNacimiento;
        int edad;

        Scanner sc = new Scanner(System.in);

        //leemos los datos
        System.out.print("Año de nacimiento: ");
        anioNacimiento = sc.nextInt();

        System.out.print("Año actual: ");
        anioActual = sc.nextInt();

        edad = anioActual - anioNacimiento; //Calculamos la edad

        System.out.println("Su edad es: " + edad + " años.");

    }

}
