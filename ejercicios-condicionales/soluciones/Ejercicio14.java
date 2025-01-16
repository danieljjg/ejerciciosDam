import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int diasDelMes = 0;
        int dia, mes, anio;

        System.out.print("Introduce el día: ");
        dia = sc.nextInt();

        System.out.print("Introduce el mes: ");
        mes = sc.nextInt();

        System.out.print("Introduce el año: ");
        anio = sc.nextInt();

        if (mes == 2) {
            diasDelMes = 28;
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diasDelMes = 30;
        }
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            diasDelMes = 31;
        }

        dia++;

        if (dia > diasDelMes) {
            dia = 1;
            mes++;

            if(mes > 12) {
                mes = 1;
                anio++;
            }

        }

        if ( anio == 0) {
            anio = 1;
        }

        System.out.println(dia + "/" + mes + "/" + anio);

    }

}
