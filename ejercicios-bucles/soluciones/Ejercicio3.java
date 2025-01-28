
// La aplicación generará un número aleatorio entre 1 y 100. A continuación el jugador irá probando suerte con la ayuda de las indicaciones que la propia aplicación le ofrece. El juego termina cuando acierta o cuando se rinde (introduciendo un -1).

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int numeroSecreto = aleatorio.nextInt(101);
        int num;

        System.out.print("Introduzca un número entre 1 y 100: ");
        num = sc.nextInt();

        while(numeroSecreto != num && num != -1) {

            if(numeroSecreto< num) {
                System.out.println("El numero secreto es menor");
            } else {
                System.out.println("El numero secreto es mayor");
            }

            System.out.print("Introduzca otro número: ");
            num = sc.nextInt();

        }

        if(numeroSecreto == num) {
            System.out.println("Enhorabuena...");
        } else {
            System.out.println("Otra vez será...");
        }

    }

}
