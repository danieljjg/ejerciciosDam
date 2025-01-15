import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        int nota1, nota2; //Variables enteras para las notas.
        double media; // La media puede contener decimales: usamos double
        Scanner sc = new Scanner(System.in);

        //Leemos las notas
        System.out.print("Nota 1: ");
        nota1 = sc.nextInt();
        System.out.print("Nota 2: ");
        nota2 = sc.nextInt();

        //Calculamos la media
        media = (nota1 + nota2) / 2.0;

        System.out.println("La media es: " + media);

    }

}
