package com.epam.tamentoring.preselection.Algorithms;

/*
    Matrix has n rows and m columns.
 */
public class RunnerMatrix {
    public static void main(String[] args) {
        int N = 10;
        int M = 15;
        Matrix matrix = new Matrix(N,M);

        System.out.println("Yor matrix is: ");
        printMatrix(matrix);

        System.out.println("Transposed matrix is: ");
        printMatrix(matrix.transposeMatrix());
    }

    static void printMatrix(Matrix mat){
        int [][] matrix = mat.getMatrix();
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
