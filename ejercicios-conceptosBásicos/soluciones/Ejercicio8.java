import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        // Valores constantes, ya que no tienen que variar a lo largo del programa.
        // Los nombres de las constantes suelen ser en mayúsculas.
        final double PRECIO_MANZANA = 2.35;
        final double PRECIO_PERAS = 1.95;

        int ventasManz1t, ventasManz2t, ventasManz3t, ventasManz4t;
        int ventasPeras1t, ventasPeras2t, ventasPeras3t, ventasPeras4t;
        double importeTotal;
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);

        System.out.println("Para las manzanas: ");
        System.out.print("Ventas (en kilos) del primer trimestre: ");
        ventasManz1t = sc.nextInt();
        System.out.print("Ventas (en kilos) del segundo trimestre: ");
        ventasManz2t = sc.nextInt();
        System.out.print("Ventas (en kilos) del tercer trimestre: ");
        ventasManz3t = sc.nextInt();
        System.out.print("Ventas (en kilos) del cuarto trimestre: ");
        ventasManz4t = sc.nextInt();

        System.out.println("Para las peras: ");
        System.out.print("Ventas (en kilos) del primer trimestre: ");
        ventasPeras1t = sc.nextInt();
        System.out.print("Ventas (en kilos) del segundo trimestre: ");
        ventasPeras2t = sc.nextInt();
        System.out.print("Ventas (en kilos) del tercer trimestre: ");
        ventasPeras3t = sc.nextInt();
        System.out.print("Ventas (en kilos) del cuarto trimestre: ");
        ventasPeras4t = sc.nextInt();

        //Calculamos el importe total obtenido;
        importeTotal = ( ventasManz1t + ventasManz2t + ventasManz3t + ventasManz4t ) * PRECIO_MANZANA;
        importeTotal = ( ventasPeras1t + ventasPeras2t + ventasPeras3t + ventasPeras4t ) * PRECIO_PERAS;

        System.out.println("El importa total es de: " + importeTotal + " euros");

    }

}
