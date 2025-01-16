import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        int dm, um, c, d, u;
        boolean capicua = false;

        System.out.print("Introduzca un número entre 0 y 99.999: ");
        num = sc.nextInt();

        //Descomponemos el número dividiendo entre 10 y mediante el resto :
        u = num % 10; // Unidades. Ej : 12345 % 10 = 5;
        num = num / 10; // Eliminamos las unidades del número. Ej : 12345 / 10 = 1234

        d = num % 10; // Decenas. Ej : 1234 % 10 = 4;
        num = num / 10; // Eliminamos las decimas del número. Ej : 1234 / 10 = 123

        c = num % 10; // Centenas. Ej : 123 % 10 = 3;
        num = num / 10; // Eliminamos las centenas del número. Ej : 123 / 10 = 12

        um = num % 10; // Unidades de millar. Ej : 12 % 10 = 2;
        num = num / 10; // Eliminamos las unidades de millar del número. Ej : 12 / 10 = 1

        dm = num; // Decenas de millar

        // Sí el número tiene 5 cifras
        if(dm != 0  && dm == u && um == d) {
            capicua = true;
        }
        // Si el número tiene 4 cifras
        if(dm == 0 && um != 0 && um == u && c == d) {
            capicua = true;
        }
        // Sí el número tiene 3 cifras
        if(dm == 0 && um == 0 && c != 0 && c == u) {
            capicua = true;
        }
        // Sí el número tiene 2 cifras
        if(dm == 0 && um == 0 && c == 0 && d!= 0 && d == u) {
            capicua = true;
        }

        // Se entiende que un número de una cifra no es capicúa.

        if(capicua) {
            System.out.println("El número es capicúa");
        } else {
            System.out.println("El número no es capicúa");
        }

    }

}
