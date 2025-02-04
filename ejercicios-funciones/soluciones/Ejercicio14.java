import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, resultado;

        System.out.println("Vamos a calcular fibonacci(n)");
        System.out.print("Introduzca n (se recomienda n<40): ");
        num = sc.nextInt();

        resultado = fibo(num);

        System.out.println("\nfibonacci(" + num + ") = " + resultado);

    }

    static int fibo(int num) {
        int res;

        if(num == 0) {
            res = 1;
        } else {
            if(num == 1){
                res = 1;
            } else {
                res = fibo(num - 1) + fibo(num - 2);
            }
        }
        return res;
    }

}
