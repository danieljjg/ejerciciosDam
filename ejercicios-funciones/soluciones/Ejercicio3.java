import java.util.Scanner;

public class Ejercicio3 {

    static void areaVolumenCilindro(double radio, double altura, int opcion) {
        double volumen, area;

        switch (opcion) {
            case 1 :
                volumen = Math.PI * Math.pow(radio, 2) * altura;
                System.out.println("El volumen es de: " + volumen);
                break;
            case 2 :
                area = 2 * Math.PI * radio * (altura + radio);
                System.out.println("El area es de: " + area);
            default:
                System.out.println("Indicador del cálculo erróneo");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double altura, radio;
        int opcion;

        System.out.print("Introduzca radio: ");
        radio = sc.nextDouble();

        System.out.print("Introduzca altura: ");
        altura = sc.nextDouble();

        System.out.println("Qué desea calcular 1 (área) / 2 (volumen): ");
        opcion = sc.nextInt();

        System.out.println();
        areaVolumenCilindro(radio, altura, opcion);

    }

}
