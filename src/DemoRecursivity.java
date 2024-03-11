/**
 * DemoRecursivity
 */
public class DemoRecursivity {

    /**
     * Afficher 10 fois un mesage avec la recursivite
     */
    public static void affichageRecursif(int i, int n) {
        if (i <= n) {
            System.out.println("Je suis l'element " + i);
            affichageRecursif(i + 1, n);
        }

    }

    /**
     * Affichage Croissant de 1 à n en utlisant un ART
     * Affichage Recursif Terminal (CROISSANT)
     */
    public static void affichageTerminalCroissant(int i, int n) {
        if (i <= n) {
            System.out.println("ART : Valeur de i :::: " + i);
            affichageTerminalCroissant(i + 1, n);
        }
    }

    /**
     * Affichage Decroissant de 1 à n en utlisant un ART
     * Affichage Recursif Terminal (DECROISSANT)
     */
    public static void affichageTerminalDeroissant(int i, int n) {
        if (i >= n) {
            System.out.println("ART : Valeur de i :::: " + i);
            affichageTerminalDeroissant(i - 1, n);
        }
    }

    /**
     * Affichage Croissant de 1 à n en utlisant un ARNT
     * Affichage Recursif Non Terminal (CROISSANT)
     */

    public static void affichageNonTerminalCroissant(int i, int n) {
        if (i >= n) {
            affichageNonTerminalCroissant(i - 1, n);
            System.out.println("ARNT : Valeur de i :::: " + i);
        }
    }

    /**
     * Affichage Decroissant de 1 à n en utlisant un ARNT
     * Affichage Recursif Non Terminal (DECROISSANT)
     */

    public static void affichageNonTerminalDeroissant(int i, int n) {
        if (i <= n) {
            affichageNonTerminalDeroissant(i - 1, n);
            System.out.println("ARNT : Valeur de i :::: " + i);
        }
    }

    public static void main(String[] args) {
        int n = 10, i = 1;
        System.out.println("=== AFFICHAGE RECURSIF ===");
        affichageRecursif(i, n);
        System.out.println("=== FIN AFFICHAGE RECURSIF ===");

        System.out.println("=== AFFICHAGE RECURSIF TERMINAL===");
        affichageTerminalCroissant(i, n);
        System.out.println("=== FIN AFFICHAGE RECURSIF TERMINAL ===");

        System.out.println("=== AFFICHAGE RECURSIF TERMINAL DECROISSANT ===");
        affichageTerminalDeroissant(n, i);
        System.out.println("=== FIN AFFICHAGE RECURSIF TERMINAL DECROISSANT ===");

        System.out.println("=== AFFICHAGE RECURSIF NON TERMINAL===");
        affichageNonTerminalCroissant(n, i);
        System.out.println("=== FIN AFFICHAGE RECURSIF  NON  TERMINAL ===");

        System.out.println("=== AFFICHAGE RECURSIF NON TERMINAL DECROISSANT ===");
        affichageTerminalDeroissant(n, i);
        System.out.println("=== FIN AFFICHAGE RECURSIF NON TERMINAL DECROISSANT ===");
    }

}
