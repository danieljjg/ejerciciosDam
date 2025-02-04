import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Introduzca un número: ");
        n = sc.nextInt();

        System.out.println("--Antes de llamar a la función--");
        eco(n);

        System.out.println("--Después de llamar a la función--");

    }

    static void eco(int a) {
        for(int i = 0; i < a; i++) {
            System.out.println("Eco...");
        }
    }

}
