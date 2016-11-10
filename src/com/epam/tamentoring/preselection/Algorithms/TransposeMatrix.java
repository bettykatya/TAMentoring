package com.epam.tamentoring.preselection.Algorithms;

import java.util.Random;

/**
 * Created by Katsiaryna Krechko on 11/10/2016.
 */

/*
    Matrix has n rows and m columns.
 */
public class TransposeMatrix {
    public static void main(String[] args) {
        int N = 10;
        int M = 15;
        int [][] matrix = getRandomMatrix(N,M);

        System.out.println("Yor matrix is: ");
        printMatrix(matrix);

        System.out.println("Transposed matrix is: ");
        printMatrix(transposeMatrix(matrix));
    }
    static private int[][] getRandomMatrix(int n, int m){
        int [][] matrix = new int[n][m];
        int maxValue = 10;

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = rand.nextInt(maxValue);
            }
        }

        return matrix;
    }
    static void printMatrix(int [][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static private int[][] transposeMatrix(int [][] matrix){
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        //int [][] transposedMatrix = matrix;

        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }
}
