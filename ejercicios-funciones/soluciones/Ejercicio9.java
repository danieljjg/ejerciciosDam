import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduzca número: ");
        num = sc.nextInt();

        divisoresPrimos(num);

    }

    static boolean esPrimo(int num) {
        boolean primo = true;

        int i = 2;

        if(num < 2) {
            primo = false;
        }

        while(i < num && primo ) {
            if(num %i == 0) {
                primo = false;
            }
            i++;
        }
        return (primo);
    }

    static void divisoresPrimos(int num) {

        System.out.println("Divisores primos de " + num);

        for(int i = 1; i <= num; i++) {
            if(esPrimo(i) && num % i == 0) {
                System.out.println("El numero " + i);
            }
        }

    }

}
