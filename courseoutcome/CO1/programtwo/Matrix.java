// Read 2 matrices from the console and perform matrix addition.

import java.util.Scanner;

class Mat {
    int rows;
    int cols;
}

public class Matrix {
    public static void main(String[] args) {

        Mat matrix1 = new Mat();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the first matrix : ");
        matrix1.rows = sc.nextInt();
        System.out.println("Enter the number of columns of the first matrix : ");
        matrix1.cols = sc.nextInt();

        int first[][] = new int[matrix1.rows][matrix1.cols];
        int second[][] = new int[matrix1.rows][matrix1.cols];
        int sum[][] = new int[matrix1.rows][matrix1.cols];

        System.out.println("Enter the elements of the first matrix : ");
        for (int i = 0; i < matrix1.rows; i++) {
            for (int k = 0; k < matrix1.cols; k++) {
                first[i][k] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix : ");
        for (int i = 0; i < matrix1.rows; i++) {
            for (int k = 0; k < matrix1.cols; k++) {
                second[i][k] = sc.nextInt();
            }
        }

        System.out.println("Elements of first matrix are : ");
        for (int i = 0; i < matrix1.rows; i++) {
            for (int k = 0; k < matrix1.cols; k++) {
                System.out.print(first[i][k] + " ");
            }
            System.out.println();
        }

        System.out.println("Elements of second matrix are : ");
        for (int i = 0; i < matrix1.rows; i++) {
            for (int k = 0; k < matrix1.cols; k++) {
                System.out.print(second[i][k] + " ");
            }
            System.out.println();
        }

        System.out.println("The sum of two matrix are : ");
        for (int i = 0; i < matrix1.rows; i++) {
            for (int k = 0; k < matrix1.cols; k++) {
                sum[i][k] = first[i][k] + second[i][k];
                System.out.print(sum[i][k] + " ");
            }
            System.out.println();
        }
    }
}
