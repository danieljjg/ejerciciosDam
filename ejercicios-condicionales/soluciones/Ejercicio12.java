import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dia, mes, anio;
        boolean fechaCorrecta;

        System.out.print("Introduce el día: ");
        dia = sc.nextInt();

        System.out.print("Introduce el mes: ");
        mes = sc.nextInt();

        System.out.print("Introduce el año: ");
        anio = sc.nextInt();

        if (anio == 0) {
            fechaCorrecta = false;
        } else {
            if (mes == 2 && (1 <= dia && dia <= 28)) {
                fechaCorrecta = true;
            } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (1 <= dia && dia <= 30)) {
                fechaCorrecta = true;
            } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (1 <= dia && dia <= 31)) {
                fechaCorrecta = true;
            } else {
                fechaCorrecta = false;
            }
        }

        if (fechaCorrecta) {
            System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + anio);
        } else {
            System.out.println("Fecha incorrecta");
        }
    }

}
