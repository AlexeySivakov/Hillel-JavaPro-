package Alishev.Alishev_13;

public class Multidimensional_Arrays {
    public static void main(String[] args) {
        int number[] = {1, 2, 3};

        int[][] matrice = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
