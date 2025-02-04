import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduzca un número: ");
        num = sc.nextInt();

        System.out.println(num + "! es igual a " + factorial(num));

    }

    static int factorial(int num) {

        int res;

        if (num == 0) {
            res = 1;
        } else {
            res = num * factorial(num - 1);
        }

        return res;

    }

}
