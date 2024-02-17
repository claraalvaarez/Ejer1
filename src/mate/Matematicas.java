/**
 * @autor Clara Alvarez
 * La clase Matematicas contiene métodos para realizar cálculos matemáticos.
 */
package mates;

import java.util.Random;

public class Matematicas {

    /**
     * Genera una aproximación al número pi mediante el método de Montecarlo.
     *
     * @param pasos el número de puntos generados
     * @return una aproximación del número pi
     */
    public static double generarNumeroPiIterativo(long pasos) {
        Random random = new Random();
        long puntosDentroCirculo = 0;

        for (long i = 0; i < pasos; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();

            if (x * x + y * y <= 1) {
                puntosDentroCirculo++;
            }
        }

        return 4.0 * puntosDentroCirculo / pasos;
    }
}
