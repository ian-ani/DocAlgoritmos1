package es.iesmz.ed.algoritmos;

import java.util.HashSet;
import java.util.Set;

/**
 * Clase Anno que comprueba si todos los dígitos de un número son diferentes o si hay alguno que coincide con otro,
 * en caso de que haya coincidencia devuelve cuantas hay.
 * @author Iris Auñón Navarro
 */

public class Anno {
    /* ATRIBUTOS */

    private long numero;

    /* CONSTRUCTOR */

    /**
     * Constructor para guardar el año a comprobar.
     * @param numero long; este parámetro recibe el año a comprobar.
     */
    public Anno(long numero) {
        this.numero = numero;
    }

    /* GETTERS */

    /**
     * Método que devuelve el año.
     * @return numero: long; devuelve el año a comprobar.
     */

    public long getNumero() {
        return numero;
    }

    /* SETTERS */

    /**
     * Método que cambia el valor del año.
     * @param numero long; cambia el año actual por otro año.
     */

    public void setNumero(long numero) {
        this.numero = numero;
    }

    /* METODO TOSTRING */

    /**
     * Método toString. Para poder mostrar el año guardado.
     * @return String; muestra el año.
     */

    @Override
    public String toString() {
        return String.format("Año: %d", numero);
    }

    /* OTROS METODOS */

    public int digitosDiferentes() {
        // Guarda cuantos numeros se han repetido
        int total = 0;

        // Obtener el largo original
        int largoOriginal = String.valueOf(numero).length();

        // Crear un set
        Set<Long> largoNuevo = new HashSet<>();

        // Guardar los numeros en un set (no admite repetidos! :))
        while (numero > 0) {
            // Obtener el ultimo digito del numero
            long tmp = numero % 10;

            // Guardar en el set
            largoNuevo.add(tmp);

            // El numero 'pierde' un digito
            numero = numero / 10;
        }

        // Comprobar si el largo ha cambiado
        if (largoOriginal != largoNuevo.size()) {
            
        }


        /*// Declarar array de 'numeros' de tipo int teniendo como tamano el largo del numero (pasado a String)
        long[] numeros = new long[String.valueOf(numero).length()];
        // Variable usada como indice para el bucle while
        int i = 0;

        // Guarda cuantos numeros se han repetido
        int total = 0;

        while (numero > 0) {
            // Obtener el ultimo digito del numero
            long tmp = numero % 10;

            // Guardar numeros en el array
            numeros[i] = tmp;

            // Incrementar variable de cuenta (para guardar en el array)
            i++;

            // El numero 'pierde' un digito
            numero = numero / 10;
        }

        // Recorrer array de numeros con cada digito
        for (int j = 0; j < numeros.length; j++) {
            if () {

            }
        }

        return total;*/
    }
}
