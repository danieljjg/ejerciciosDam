import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int NUM_ALUM = 5;
        double mediaAlumno;

        int primer[] = new int[NUM_ALUM];
        int segundo[] = new int[NUM_ALUM];
        int tercero[] = new int[NUM_ALUM];

        System.out.println("Notas del primer trimestre");
        leerNotas(primer);
        System.out.println("Notas del segundo trimestre");
        leerNotas(segundo);
        System.out.println("Notas del tercer trimestre");
        leerNotas(tercero);

        int sumaPrimer = 0, sumaSegundo = 0, sumaTercero = 0;

        for(int i = 0; i < NUM_ALUM; i++) {
            sumaPrimer += primer[i];
            sumaSegundo += segundo[i];
            sumaTercero += tercero[i];
        }

        System.out.println("Media primer trimestre: " + (double) sumaPrimer / primer.length);
        System.out.println("Media segundo trimestre: " + (double) sumaSegundo / segundo.length);
        System.out.println("Media tercer trimestre: " + (double) sumaTercero / tercero.length);

        System.out.println();

        System.out.println("Introduzca posición del alumno: ");
        int pos = sc.nextInt();

        mediaAlumno = (double) (primer[pos] + segundo[pos] + tercero[pos] / 3);
        System.out.println("La media del alumno es : " + mediaAlumno);

    }

    static void leerNotas(int t[]) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < t.length; i++) {
            System.out.print("Alumno (" + (i + 1) + ") : ");
            t[i] = sc.nextInt();
        }
    }

}
