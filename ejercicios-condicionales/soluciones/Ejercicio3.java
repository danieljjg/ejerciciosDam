import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.print("Introduzca un número: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca un número: ");
        n2 = sc.nextInt();

        //El caso donde ambos números son iguales no se contempla.

        if(n1 > n2) {
            System.out.println(n1 + " es mayor que " + n2);
        } else {
            System.out.println(n2 + " es mayor que " + n1);
        }

    }

}
