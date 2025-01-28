import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Escriba n: ");
        n = sc.nextInt();

        for(int fila = 1; fila <= n; fila++) {
            for(int col = fila; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

}
