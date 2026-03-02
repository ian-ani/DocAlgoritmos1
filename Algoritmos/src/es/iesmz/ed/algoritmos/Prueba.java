package es.iesmz.ed.algoritmos;

public class Prueba {
    public static void main(String[] args) {
        // Prueba con Hyperpar
        Hyperpar numero = new Hyperpar(2568);

        System.out.printf("%s\n", numero.esHyperPar() ? "Es hyperpar." : "No es hyperpar.");

        // Prueba con Anno
        Anno anno1 = new Anno(1998);
        Anno anno2 = new Anno(1999);
        Anno anno3 = new Anno(2000);
        Anno anno4 = new Anno(1994);
        Anno anno5 = new Anno(1982);

        System.out.printf("Número: %d | Dígitos diferentes: %d\n", anno1.getNumero(), anno1.digitosDiferentes());
        System.out.printf("Número: %d | Dígitos diferentes: %d\n", anno2.getNumero(),anno2.digitosDiferentes());
        System.out.printf("Número: %d | Dígitos diferentes: %d\n", anno3.getNumero(),anno3.digitosDiferentes());
        System.out.printf("Número: %d | Dígitos diferentes: %d\n", anno4.getNumero(),anno4.digitosDiferentes());
        System.out.printf("Número: %d | Dígitos diferentes: %d\n", anno5.getNumero(),anno5.digitosDiferentes());
    }
}
