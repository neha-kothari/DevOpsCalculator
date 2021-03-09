
import java.util.Scanner;

import static java.lang.System.exit;

public class Calculator {
    public static double squareRoot(double var){
        return Math.sqrt(var);
    }

    public static double factorial(double var){
        double fact = 1;
        for(int i = 1; i <= var; i++){
            fact *= i;
        }
        return fact;
    }

    public static double logarithm(double var){
        return Math.log(var);
    }

    public static double power(double var1, double var2){
        return Math.pow(var1, var2);
    }

    public static void main(String[] args) {
        int choice;
        double x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------- !! Calculator Operations !! ----------");
        while(true){
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power");
            System.out.println("5. Exit");
            System.out.print("Please enter your choice : ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Square Root Operation:");
                    System.out.print("Enter the number: ");
                    x = scanner.nextDouble();
                    System.out.println("Square Root of " + x + " : " + squareRoot(x));
                    System.out.println("---------- !! Result evaluated !! ----------");
                    break;

                case 2:
                    System.out.println("Factorial Operation:");
                    System.out.print("Enter the number: ");
                    x = scanner.nextDouble();
                    double result = factorial(x);
                    System.out.println("Factorial of " + x + " : " + result);
                    System.out.println("---------- !! Result evaluated !! ----------");
                    break;
                case 3:
                    System.out.println("Natural Logarithm Operation:");
                    System.out.print("Enter the number: ");
                    x = scanner.nextDouble();
                    System.out.println("Natural Logarithm of " + x + " : " + logarithm(x));
                    System.out.println("---------- !! Result evaluated !! ----------");
                    break;
                case 4:
                    System.out.println("Exponential Function:");
                    System.out.println("Enter the first number: ");
                    x = scanner.nextDouble();
                    System.out.println("Enter the second number : ");
                    y = scanner.nextDouble();
                    System.out.println("Power :" + x + "^" + y + " : " + power(x,y));
                    System.out.println("---------- !! Result evaluated !! ----------");
                    break;

                case 5:
                    System.out.println("---------- !! Exit !! ----------");
                    exit(0);
                default:
                    System.out.println("Invalid choice entered!");

            }
            System.out.println("\n");
        }

    }
}