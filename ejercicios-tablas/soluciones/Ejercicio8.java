import java.util.Arrays;

public class Ejercicio8 {

    public static void main(String[] args) {

        int sin[], con[] = {1, 2, 3, 3, 1, 3, 4, 2, 3, 5};
        sin = sinRepetidos(con);
        System.out.println(Arrays.toString(sin));

    }

    /*
    * Vamos a realizar un doble recorrido de la tabla t. En el recorrido principal, se comprueba el elemento i (t[i)), para cada elemento, vamos a volver a recorrer la tabla, en este caso, entre 0 y i-1, donde comprobamos si se encuentra t[i].
    * Si encontramos el elemento, es que es una repetición, lo que hacemos es eliminar t[i]
    *  */

    static int[] sinRepetidos(int t[]) {
        int copia[] = Arrays.copyOf(t, t.length);
        int numElem = copia.length;
        int i = 0;

        while(i < numElem) {
            int aBuscar = copia[i];
            int j = 0;

            while(j < i && copia[j] != aBuscar) {
                j++;
            }

            if(j < i) {
                copia[i] = copia[numElem - 1];
                numElem--;
            } else {
                i++;
            }

        }
        return Arrays.copyOf(copia, numElem);
    }

}
