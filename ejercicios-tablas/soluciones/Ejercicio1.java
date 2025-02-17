import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double t[] = new double[5];

        for(int i = 0; i < t.length; i++) {
            System.out.print("Introduzca un número :");
            t[i] = sc.nextDouble();
        }

        System.out.println("Los números son: ");
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[1]);
        }

        //Podemos ahorrarnos el segundo recorrido, aprovechando Arrays.toString().

        System.out.println("Otra forma de mostrar la tabla");
        System.out.println(Arrays.toString(t));

    }
}
