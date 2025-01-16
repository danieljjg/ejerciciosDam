import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nota;

        System.out.print("Introduzca una nota: ");
        nota = sc.nextInt();

        if (0 <= nota && nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota == 5) {
            System.out.println("Suficiente");
        } else if (nota == 6) {
            System.out.println("Bien");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else if(nota < 11) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Nota no válida");
        }

    }

}
