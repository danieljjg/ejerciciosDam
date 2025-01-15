import java.util.Scanner;

public class Ejecicio2 {

    public static void main(String[] args) {

        int edad;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba su edad: ");
        edad = sc.nextInt();

        edad = edad + 1;
        //La linea anterior puede sustituirse por: edad ++
        // Tambien se puede sustituir por edad += 1

        System.out.println("El próximo año su edad será: " + edad + " años");

    }

}
