import java.util.Locale;
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        final double PI = Math.PI; //Pi como constante. La librería MATH ofrece una constante cuyo valor es exacto al de PI con todos sus decimales.
        double radio;
        double area, longitud;
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);

        System.out.print("Escriba el radio: ");
        radio = sc.nextInt();

        longitud = 2 * PI * radio;
        area = PI * radio * radio; //Para calcular el cuadrado también podemos utilizar : Math.pow(radio, 2)

        System.out.println("La longitud del círculo es: " + longitud);
        System.out.println("El área de la circunferencia es: " + area);
    }

}
