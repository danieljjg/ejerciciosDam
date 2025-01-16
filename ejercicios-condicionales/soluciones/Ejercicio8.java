import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a,b,c;
        double x1,x2, d;

        System.out.print("Introduzca primer coeficiente (a): ");
        a = sc.nextDouble();

        System.out.print("Introduzca segundo coeficiente (b): ");
        b = sc.nextDouble();

        System.out.print("Introduzca primer coeficiente (c): ");
        c = sc.nextDouble();

        //Calculamos el discriminante
        d = (b * b - 4 * a * c);

        if(d < 0) {// Hay que calcular la raíz cuadrada de d (d no puede ser negativo)
            System.out.println("No existen soluciones reales");
        } else {
            //Si a = 0 nos encontraríamos una división por cero. Y en este caso, ni si quiera sería una ecuación de 2ºgrado.
            if(a == 0) {
                System.out.println("No es una ecuación de segundo grado");
            } else {
                x1 = (-b + Math.sqrt(d)) / (2 * a);//Math.sqrt() calcula la raíz cuadrada
                x2 = (-b - Math.sqrt(d)) / (2 * a);

                System.out.println("Solución 1: " + x1);
                System.out.println("Solución 2: " + x2);
            }
        }

    }

}
