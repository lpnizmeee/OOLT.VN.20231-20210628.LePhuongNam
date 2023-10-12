import java.util.Scanner;
public class AddMatrices {
    public static void main(String[] args) {
        System.out.println("Enter number of row: ");
        int row = new Scanner(System.in).nextInt();
        System.out.println("Enter number of column: ");
        int column = new Scanner(System.in).nextInt();
        double[][] matrix1 = new double[row][column];
        double[][] matrix2 = new double[row][column];
        double[][] sum = new double[row][column];
        System.out.println("Enter the first matrix: ");
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < column; ++j) {
                System.out.println("Enter the element " + (i + 1) + " " + (j + 1) + ": ");
                matrix1[i][j] = new Scanner(System.in).nextDouble();
            }
        }
        System.out.println("Enter the second matrix: ");
        for(int i = 0; i < row; ++i) {
            for (int j = 0; j < column; ++j) {
                System.out.println("Enter the element " + (i + 1) + " " + (j + 1) + ": ");
                matrix2[i][j] = new Scanner(System.in).nextDouble();
            }
        }
        System.out.println("The sum of two matrices is: ");
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < column; ++j){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        System.exit(0);
    }
}
