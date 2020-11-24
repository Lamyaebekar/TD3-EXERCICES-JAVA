import java.util.Scanner;

class MulMatMod {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * Point d'entrée du programme. Demande à l'utilisateur
     * d'entrer deux matrices, les multiplie, et affiche
     * le résultat.
     */
    public static void main(String[] args) {
        double[][] mat1 = lireMatrice();
        double[][] mat2 = lireMatrice();
        if (mat1[0].length != mat2.length) {
          System.out.println("Multiplication de matrices impossible !");
        } else {
            double[][] prod = multiplierMatrice(mat1, mat2);
          System.out.println("Résultat :");
            afficherMatrice(prod);
        }
    }

    /**
     * Demande à l'utilisateur d'entrer un entier
     * strictement positif.
     * @param message Le message affiché à l'utilisateur.
     * @return Un entier strictement positif.
     */ 
    static int lireEntier(String message) {
        int n;
        do {
          System.out.print(message);
            n = scanner.nextInt();
        } while (n < 1);
        return n;
    }

    /**
     * Demande à l'utilisateur de remplir une matrice.
     * @return Un tableau de double contenant la matrice.
     */ 
    static double[][] lireMatrice() {
      System.out.println("Saisie d'une matrice :");

        int lignes = lireEntier("  Nombre de lignes : ");
        int colonnes = lireEntier("  Nombre de colonnes : ");

        double[][] mat = new double[lignes][colonnes];
        for (int row = 0; row < lignes; row++)
            for (int col = 0; col < colonnes; col++) {
              System.out.print("  mat[" + (row + 1) + "," + (col + 1) + "]=");
                mat[row][col] = scanner.nextDouble();
            }
        return mat;
    }

    /**
     * Multiplie deux matrices.
     * @param mat1 Le premier opérande
     * @param mat2 Le deuxième opérande
     * @return Un tableau de double contenant le produit
     */ 
    static double[][] multiplierMatrice(double[][] mat1, double[][] mat2) {
        double[][] prod = new double[mat1.length][mat2[0].length];
        for (int row = 0; row < mat1.length; row++) {
            for (int col = 0; col < mat2[0].length; col++) {
                prod[row][col] = 0.0;
                for (int i = 0; i < mat2.length; i++) {
                    prod[row][col] += mat1[row][i] * mat2[i][col];
                }
            }
        }
        return prod;
    }

    /**
     * Affiche une matrice à l'écran
     * @param prod La matrice à afficher
     */ 
    static void afficherMatrice(double[][] prod) {
        for (int row = 0; row < prod.length; row++) {
            for (int col = 0; col < prod[row].length; col++) {
              System.out.print(prod[row][col] + " ");
            }
            // Retour à la ligne
          System.out.println();
        }
    }
}