import javax.swing.JOptionPane;
import java.util.Scanner;
public class EquationSolver {
    public static void main(String[] args) {
        System.out.println("Equation Solver:\n1. Solve a linear equation: ax + b = 0\n2. Solve a quadratic equation: ax^2 + bx + c = 0\n3. Solve a system of first-degree equation: ax + by = c and dx + ey = f\n4. Quit");
        int option = new Scanner(System.in).nextInt();
        switch (option) {
            case 1:
                solveLinearEquation();
                break;
            case 2:
                solveQuadraticEquation();
                break;
            case 3:
                solveSystemOfFirstDegreeEquation();
                break;
            default:
                JOptionPane.showMessageDialog(null, "You chose to quit!");
                break;
        }
    }
    public static void solveLinearEquation() {
        System.out.println("You chose to solve a linear equation: ax + b = 0");
        System.out.println("Please enter the values of a");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Please enter the values of b");
        double b = new Scanner(System.in).nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has infinite solutions");
            } else {
                System.out.println("The equation has no solution");
            }
        } else {
            System.out.println("The equation has one solution: " + (-b / a));
        }
    }
    public static void solveQuadraticEquation() {
        System.out.println("You chose to solve a quadratic equation: ax^2 + bx + c = 0");
        System.out.println("Please enter the values of a");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Please enter the values of b");
        double b = new Scanner(System.in).nextDouble();
        System.out.println("Please enter the values of c");
        double c = new Scanner(System.in).nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("The equation has infinite solutions");
                } else {
                    System.out.println("The equation has no solution");
                }
            } else {
                System.out.println("The equation has one solution: " + (-c / b));
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("The equation has no solution");
            } else if (delta == 0) {
                System.out.println("The equation has one solution: " + (-b / (2 * a)));
            } else {
                System.out.println("The equation has two solutions: " + ((-b + Math.sqrt(delta)) / (2 * a)) + " and " + ((-b - Math.sqrt(delta)) / (2 * a)));
            }
        }
    }
    public static void solveSystemOfFirstDegreeEquation() {
        System.out.println("You chose to solve a system of first-degree equation: ax + by = c and dx + ey = f");
        System.out.println("Please enter the values of a");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Please enter the values of b");
        double b = new Scanner(System.in).nextDouble();
        System.out.println("Please enter the values of c");
        double c = new Scanner(System.in).nextDouble();
        System.out.println("Please enter the values of d");
        double d = new Scanner(System.in).nextDouble();
        System.out.println("Please enter the values of e");
        double e = new Scanner(System.in).nextDouble();
        System.out.println("Please enter the values of f");
        double f = new Scanner(System.in).nextDouble();
        double delta = a * e - b * d;
        double deltaX = c * e - b * f;
        double deltaY = a * f - c * d;
        if (delta == 0) {
            if (deltaX == 0 && deltaY == 0) {
                System.out.println("The system has infinite solutions");
            } else {
                System.out.println("The system has no solution");
            }
        } else {
            System.out.println("The system has one solution: " + "x = " + (deltaX / delta) + " and y = " + (deltaY / delta));
        }
    }
}