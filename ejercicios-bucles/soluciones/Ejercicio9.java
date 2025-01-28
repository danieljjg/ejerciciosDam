// Introducimos la altura de cada árbol dentro de un bucle y guardaremos la mayor y el número de etiqueta del árbol al que corresponde.

// En la búsqueda del máximo (o mínimo) se nos planeta un problema : con qué valor incializamos el máximo. Hemos de inicializar el máximo con un valor menor o igual a algunos de los valores con los que trabajaremos.

// Un ejemplo: si se desea calcular el máximo de {-2, -7 y -4}, está claro que el máximo es -2, pero si inicializamos de forma arbitraria el máximo a 0, al ser 0 mayor que cualquier valor del conjunto, el algoritmo dirá que el máximo es 0. Algo erróneo.

// En este caso, como trabajamos con alturas (todos positivos), podríamos inicializar sin problema a 0, ya que 0 es menor que cualquier positivo. Sin embargo, en el caso general, la mejor opción es inicializar el máximo al primer valor leído.

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int etiquetaArbolMasAlto, alturaArbolMasAlto;
        int etiqueta = 0;
        int altura;

        System.out.println("Altura del árbol ( " + etiqueta + " ):");
        altura = sc.nextInt();

        alturaArbolMasAlto = altura;
        etiquetaArbolMasAlto = 0;

        while(altura != -1) {

            if(altura > alturaArbolMasAlto) {

                alturaArbolMasAlto = altura;
                etiquetaArbolMasAlto = etiqueta;

            }

            etiqueta++;
            System.out.println("Altura del árbol ( " + etiqueta + " ): ");
            altura = sc.nextInt();

        }

        if(alturaArbolMasAlto == -1 ) {
            System.out.println("No hay ningún arbol");;
        } else {
            System.out.println("El árbol más alto mide: " + alturaArbolMasAlto);
            System.out.println("Corresñonde al árbol con etiqueta " + etiquetaArbolMasAlto);
        }
    }

}
