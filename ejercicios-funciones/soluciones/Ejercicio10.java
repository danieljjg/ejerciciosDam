import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Introduce el primer número: ");
        a = sc.nextInt();

        System.out.println("Introduce el segundo número: ");
        b = sc.nextInt();

        if(amigos(a, b)) {
            System.out.println(a + " y " + b + " son amigos");
        } else {
            System.out.println("No son amigos");
        }
    }

    static boolean amigos(int a, int b) {

        boolean amigos;

        if(a == sumaDivisoresPropios(b) && b == sumaDivisoresPropios(a)) {
            amigos = true;
        } else {
            amigos = false;
        }

        return amigos;

    }

    static int sumaDivisoresPropios(int num) {

        int suma = 0;

        for(int i = 1; i < num; i++) {
            if(num % i == 0) {
                suma += i;
            }
        }

        return suma;

    }

}
