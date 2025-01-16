import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduzca un número entre el 0 y el 99: ");
        num = sc.nextInt();

        if (10 <= num && num <= 15) {
            switch (num) {
                case 10:
                    System.out.println("diez");
                    break;
                case 11:
                    System.out.println("once");
                    break;
                case 12:
                    System.out.println("doce");
                    break;
                case 13:
                    System.out.println("trece");
                    break;
                case 14:
                    System.out.println("catorce");
                    break;
                case 15:
                    System.out.println("quince");
                    break;
            }
        } else {
            int unidades = num % 10;
            int decenas = num / 10;

            switch (decenas) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("deici");
                    break;
                case 2:
                    System.out.println("veinti");
                    break;
                case 3:
                    System.out.println("treinta");
                    break;
                case 4:
                    System.out.println("cuarenta");
                    break;
                case 5:
                    System.out.println("cincuenta");
                    break;
                case 6:
                    System.out.println("sesenta");
                    break;
                case 7:
                    System.out.println("setenta");
                    break;
                case 8:
                    System.out.println("ochenta");
                    break;
                case 9:
                    System.out.println("noventa");
                    break;
            }

            if (decenas != 0 && decenas != 1 && unidades != 0) {
                System.out.println("y");
            }

            switch (unidades) {
                case 0:
                    if (decenas == 0) {
                        System.out.println("cero");
                    }
                case 1:
                    System.out.println("uno");
                    break;
                case 2:
                    System.out.println("dos");
                    break;
                case 3:
                    System.out.println("tres");
                    break;
                case 4:
                    System.out.println("cuatro");
                    break;
                case 5:
                    System.out.println("cinco");
                    break;
                case 6:
                    System.out.println("seis");
                    break;
                case 7:
                    System.out.println("siete");
                    break;
                case 8:
                    System.out.println("ocho");
                    break;
                case 9:
                    System.out.println("nueve");
                    break;
            }
        }

    }

}
