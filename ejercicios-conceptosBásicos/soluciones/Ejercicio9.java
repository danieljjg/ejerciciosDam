import java.util.Locale;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        double precioManzanas, precioPeras;

        int ventasManz1t, ventasManz2t, ventasManz3t, ventasManz4t;
        int ventasPeras1t, ventasPeras2t, ventasPeras3t, ventasPeras4t;
        double importeTotal;
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);

        System.out.print("Precio del kilo de las manzanas: ");
        precioManzanas = sc.nextInt();
        precioPeras = sc.nextInt();

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
        importeTotal = ( ventasManz1t + ventasManz2t + ventasManz3t + ventasManz4t ) * precioManzanas;
        importeTotal = ( ventasPeras1t + ventasPeras2t + ventasPeras3t + ventasPeras4t ) * precioPeras;

    }

}
