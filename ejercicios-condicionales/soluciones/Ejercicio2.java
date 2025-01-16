import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;

        System.out.print("Introduzca un número: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca otro número: ");
        n2 = sc.nextInt();

        if(n1 == n2) {
            System.out.println("Ambos números son iguales");
        } else {
            System.out.println("Los números son distintos");
        }

    }

}
