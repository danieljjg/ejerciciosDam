import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;

        System.out.print("Introduzca un número real positivo o negativo: ");
        num = sc.nextDouble();

        if(-1 < num && num < 1 && num != 0) {
            System.out.println("Es un número casi-cero");
        } else {
            System.out.println("No es un número casi-cero");
        }
    }

}
