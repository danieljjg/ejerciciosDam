import java.util.Scanner;

// A priori no tenemos la certeza de cuántas veces se ejecutará el informe, por lo tanto, los únicos bucles que se adaptan son while o do-while. Recordamos que la diferencia entre ellos es que uno se ejecuta 0 o más veces, y el otro al menos 1 vez.
// En este caso, si se introduce un 0 como primer número, el informe no se ejecuta.

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean esPar, esPositivo;
        int num;

        System.out.print("Introduce número: ");
        num = sc.nextInt();

        while( num != 0 ) {

            esPar = num % 2 == 0;
            esPositivo = num >= 0;

            System.out.println("esPar?: " + esPar + "\nEs positivo? : " + esPositivo);
            System.out.println("Cuadrado: " + num * num);

            System.out.print("Introduzca otro número: ");
            num = sc.nextInt();

        }

        System.out.println("Ha salido del programa");
    }
}
