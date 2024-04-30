package p2;

import java.lang.Math;

public class Calcul {
    public static long factoriel(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Le factoriel n'est défini que pour les entiers non négatifs");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factoriel(n - 1);
    }

    public static double puissance(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double racineCarree(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("La racine carrée n'est définie que pour les nombres non négatifs");
        }
        return Math.sqrt(x);
    }

    public static int partieEntiere(double x) {
        return (int) x;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factoriel de " + n + ": " + Calcul.factoriel(n));

        double base = 2.0;
        double exponent = 3.0;
        System.out.println(base + " ^ " + exponent + ": " + Calcul.puissance(base, exponent));

        double sqrtInput = 25.0;
        System.out.println("Racine carrée de " + sqrtInput + ": " + Calcul.racineCarree(sqrtInput));

        double realNumber = 7.8;
        System.out.println("Partie entière de " + realNumber + ": " + Calcul.partieEntiere(realNumber));
    }
}
