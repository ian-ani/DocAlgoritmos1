package es.iesmz.ed.algoritmos;

public class Prueba {
    public static void main(String[] args) {
        Hyperpar numero = new Hyperpar(2568);

        System.out.printf("%s", numero.esHyperPar() ? "Es hyperpar" : "No es hyperpar");
    }
}
