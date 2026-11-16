package es.buildverde;

/** Clase mínima para comprobar la canalización de integración continua. */
public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println("Build Verde · 2 + 3 = " + c.sumar(2, 3));
    }
}
