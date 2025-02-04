public class Ejercicio12 {

    public static void main(String[] args) {

        for(int operacion = 1; operacion <= 4; operacion++) {
            double resultado = calculadora(3, 4, operacion);
        }

    }

    static double calculadora(int a, int b, int operacion) {
        double result;

        switch (operacion) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                result = (double)a / b;
                break;
            default:
                result = 0;
                System.out.println("Operación no válida");
                break;
        }

        return result;

    }

}
