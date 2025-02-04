import java.util.Scanner;

public class Ejercicio4 {

    static int maximo(int a, int b) {

        int max;

        if(a > b) {
            max = a;
        } else {
            max = b;
        }

        return(max);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Introduzca un número: ");
        a = sc.nextInt();

        System.out.println("Introduzca otro número: ");
        b = sc.nextInt();

        System.out.println("El número mayor es: " + maximo(a, b));

    }

}
