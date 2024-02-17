package main;

import mate.Matematicas;

/**
 * La clase Main contiene el método main para probar los cálculos matemáticos.
 */
public class Main {
    /**
     * Método principal que prueba los cálculos matemáticos.
     *
     * @param args los argumentos de la línea de comandos (no se utilizan en este programa)
     */
    public static void main(String[] args) {
        double resultado = Matematicas.integralEXCuadrado(0, 1, 0.1);
        System.out.println("El resultado de la integral es: " + resultado);
    }
}
