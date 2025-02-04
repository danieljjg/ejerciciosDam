import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double base;
        int exp;

        System.out.print("Introduzca base (real): ");
        base = sc.nextDouble();

        System.out.print("Introduzca el exponente: ");
        exp = sc.nextInt();

        double res = aElevadoN(base, exp);
        System.out.println(base + " elevado a " + exp + " = " + res);

    }

    //OPCION 1
//    static double aElevadoN(double a, int n) {
//
//        double res = 1;
//
//        if(n == 0) {
//            res = 1;
//        } else {
//            for(int i = 1; i <= n; i++) {
//                res = res * a;
//            }
//        }
//
//        return res;
//
//    }

    //OPCION 2
    static double aElevadoN(double a, int n) {
        double res;

        if(n == 0) {
            res = 1;
        } else {
            res = a * aElevadoN(a, n-1);
        }

        return res;

    }

}
