package es.iesmz.ed.algoritmos;

import java.util.HashSet;
import java.util.Set;

public class DividirFactorial {
    /* ATRIBUTOS */

    private long numerador;
    private long denominador;

    /* CONSTRUCTOR */

    /**
     * Constructor para guardar el año a comprobar.
     * @param numerador long; recibe el numerador de la división.
     * @param denominador long; recibe el denominador/divisor de la división.
     */

    public DividirFactorial(long numerador, long denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    /* GETTERS */

    /**
     * Método que devuelve el numerador.
     * @return numerador: long; devuelve el numerador.
     */

    public long getNumerador() {
        return numerador;
    }

    /**
     * Método que devuelve el denominador.
     * @return denominador: long; devuelve el denominador.
     */

    public long getDenominador() {
        return denominador;
    }

    /* SETTERS */

    /**
     * Método que cambia el numerador de la operación.
     * @param numerador long; cambia el numerador por otro.
     */

    public void setNumerador(long numerador) {
        this.numerador = numerador;
    }

    /**
     * Método que cambia el denominador de la operación.
     * @param denominador long; cambia el denominador por otro.
     */

    public void setDenominador(long denominador) {
        this.denominador = denominador;
    }

    /* METODO TOSTRING */

    /**
     * Método toString. Para poder mostrar el año guardado.
     * @return String; muestra el año.
     */

    @Override
    public String toString() {
        return String.format("%d / %d", numerador, denominador);
    }

    /* OTROS METODOS */


}
