import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.print("Introduzca un número: ");
        n1 = sc.nextInt();

        System.out.print("Introduzca otro número: ");
        n2 = sc.nextInt();

        if(n1 == n2) {
            System.out.println("Son iguales");
        } else {
            if(n1 > n2) {
                System.out.println(n1 + " es mayor que " + n2);
            } else {
                System.out.println(n2 + " es mayor que " + n1);
            }
        }

    }

}
