import java.util.Scanner;

public class Ejercicio2 {

    static void mostrar(int a, int b) {
        int mayor = a > b ? a : b;
        int menor = a < b ? a : b;

        for(int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.println("Introduzca primer número: ");
        a = sc.nextInt();

        System.out.println("Introduzca segundo número: ");
        b = sc.nextInt();

        mostrar(a, b);

    }

}
