package javaAssignments;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        System.err.println("This is a program for adding matrices.");

        int width, height;


        Scanner scanner = new Scanner(System.in);
        System.err.print("Enter the width of the matrices: ");
        width = scanner.nextInt();
        System.err.print("Enter the height of the matrices: ");
        height = scanner.nextInt();

        double[][] matrix1 = new double[height][width];

        // Read the elements of the first matrix
        System.err.println("Enter the elements of the first matrix (row by row):");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix1[i][j] = scanner.nextDouble();
            }
        }

        // Allocate the second matrix
        double[][] matrix2 = new double[height][width];

        // Read the elements of the second matrix
        System.err.println("Enter the elements of the second matrix (row by row):");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix2[i][j] = scanner.nextDouble();
            }
        }

        // Allocate the result matrix
        double[][] resultMatrix = new double[height][width];

        // Add the two matrices and store the result in the result matrix
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print the resulting matrix
        System.out.println("Resulting matrix:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}



