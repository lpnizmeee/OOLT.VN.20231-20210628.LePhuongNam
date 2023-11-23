import java.util.Arrays;
import java.util.Scanner;

public class CalculateWithArray {
    public static void main(String[] args) {
        System.out.println("Set the length of array: ");
        int n = new Scanner(System.in).nextInt();
        double[] numericArray = new double[n];
        double element;
        for (int i = 0; i < n; ++i) {
            System.out.println("Enter the element " + (i + 1) + ": ");
            element = new Scanner(System.in).nextDouble();
            numericArray[i] = element;
        }



        // Sort the array in ascending order
        Arrays.sort(numericArray);

        System.out.println("Sorted Array:");
        for (double num : numericArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Calculate the sum of array elements
        double sum = 0;
        for (double num : numericArray) {
            sum += num;
        }

        // Calculate the average value
        double average = sum / numericArray.length;

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average value of array elements: " + average);
        System.exit(0);
    }
}
