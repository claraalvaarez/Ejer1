package mate;

/**
 * La clase Matematicas proporciona métodos estáticos para cálculos matemáticos.
 */
public class Matematicas {
    /**
     * Calcula la integral de e^(x^2) utilizando el método de los rectángulos.
     *
     * @param limInf el límite inferior de integración
     * @param limSup el límite superior de integración
     * @param h      el paso
     * @return el resultado de la integral definida
     */
    public static double integralEXCuadrado(double limInf, double limSup, double h) {
        return integralEXCuadradoRecursivo(limInf, limSup, h, limInf);
    }

    private static double integralEXCuadradoRecursivo(double limInf, double limSup, double h, double current) {
        if (current >= limSup) {
            return 0; // Condición de terminación de la recursión
        } else {
            double f_x = Math.exp(current * current); // Calcular el valor de f(x) = e^(x^2) en el punto actual
            double areaRectangulo = f_x * h; // Área del rectángulo en este punto
            double areaRestante = integralEXCuadradoRecursivo(limInf, limSup, h, current + h); // Llamada recursiva para el siguiente punto
            return areaRectangulo + areaRestante; // Suma del área de este rectángulo y las áreas restantes
        }
    }
}
