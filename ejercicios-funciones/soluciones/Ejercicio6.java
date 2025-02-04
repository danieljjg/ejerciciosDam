public class Ejercicio6 {

    public static void main(String[] args) {

        System.out.println("La i es una vocal: " + esVocal('i'));
        System.out.println("La e es una vocal: " + esVocal('e'));
        System.out.println("La f es una vocal: " + esVocal('F'));

    }

    static boolean esVocal(char c) {

        boolean resultado;
        
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ) {
            resultado = true;
        } else {
            resultado = false;
        }

        return resultado;

    }

}
