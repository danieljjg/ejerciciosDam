import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        double n; //Aquí guardamos el número decimal introducido por el usuario
        int rendondeo; // Utilizamos esta variable para truncar los decimales;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); //En lugar de coma utiliza punto a la hora de introducir decimales por teclado.

        System.out.print("Escriba un número decimal (con punto): ");
        n = sc.nextDouble();
        rendondeo = (int) (n + 0.5);

        System.out.println(n + " redondeado es: " + rendondeo);

    }

}
