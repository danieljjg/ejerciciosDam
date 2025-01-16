import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduzca un número entre 0 y 99.999: ");
        num = sc.nextInt();

        if(num < 10) {
            System.out.println("Tiene una cifra");
        } else if(num < 100) {
            System.out.println("Tiene dos cifras");
        } else if(num < 1000) {
            System.out.println("Tiene tres cifras");
        } else if(num < 10000) {
            System.out.println("Tiene cuatro cifras");
        } else if(num < 100000) {
            System.out.println("Tiene 5 cifras");
        } else {
            System.out.println("Número no valido");
        }

    }

}
