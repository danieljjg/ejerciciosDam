public class Ejercicio8 {

    static boolean esPrimo(int num) {
        boolean primo = true;

        int i = 2;

        if(num < 2) {
            primo = false;
        }

        while(i < num && primo ) {
            if(num %i == 0) {
                primo = false;
            }
            i++;
        }
        return (primo);
    }

    static int numDvisoresPrimos(int num) {

        int cont = 1;

        for(int i = 2; i <= num; i++) {

            if(esPrimo(i) && num %i == 0) {
                cont++;
            }

        }

        return cont;

    }

    public static void main(String[] args) {

        System.out.println("Divisores del 24: " + numDvisoresPrimos(24));

    }

}
