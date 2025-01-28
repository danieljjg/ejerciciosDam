import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("Introduzca un número (de 1 a 10): ");
            num = sc.nextInt();
        } while(!(1 <= num && num <= 10));

    }

}
