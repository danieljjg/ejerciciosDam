import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        int n, min, max;
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor minimo del rango: ");
        min = sc.nextInt();

        System.out.print("Valor máximo del rango: ");
        max = sc.nextInt();

        do{

            System.out.println("Escriba un número");
            n = sc.nextInt();

        }while(!(min <= n && n <= max ));

        System.out.println(n + " Pertenece al rango");

    }

}
