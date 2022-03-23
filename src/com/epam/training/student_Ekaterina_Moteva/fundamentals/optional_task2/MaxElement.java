package com.epam.training.student_Ekaterina_Moteva.fundamentals.optional_task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxElement {
    public static void main(String[] args) throws IOException {
        //Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие (обнулить).
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int row = 0;
        int column = 0;

        int n = Integer.parseInt(reader.readLine());

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int) (Math.random()*100);
            }
        }
        System.out.println(Arrays.deepToString(matrix));

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j]>max){
                    max = matrix[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println("Max element is " + max + ", row is " + row + ", column is " + column + ".");

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (i == row || j == column){
                    matrix[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
