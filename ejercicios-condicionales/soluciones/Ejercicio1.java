import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduzca un número: ");
        num = sc.nextInt();

        if(num %2 == 0) {
            System.out.println("Es par");
        }else {
            System.out.println("Es impar");
        }

    }

}
