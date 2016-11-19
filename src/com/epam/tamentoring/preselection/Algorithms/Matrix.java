package com.epam.tamentoring.preselection.Algorithms;

import java.util.Random;

public class Matrix {
    private int [][] matrix;
    public Matrix(int n, int m){
        matrix = new int[n][m];
        setRandomMatrix(n,m);
    }
    public Matrix(int [][] matrix){
        this.matrix = matrix;
    }
    public int [][] getMatrix(){
        return matrix;
    }
    private void setRandomMatrix(int n, int m){
        int maxValue = 10;

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = rand.nextInt(maxValue);
            }
        }
    }
    public Matrix transposeMatrix(){
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];

        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return new Matrix(transposedMatrix);
    }
}
