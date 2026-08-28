import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Short calculator application
        // +,-,*,/ as operators
        // input() calls calculate()
    
        while(true) {
            input();
        }

        
    }

    public static void input() {
        Scanner scanner_operator = new Scanner(System.in);
        Scanner scanner_double_a = new Scanner(System.in);
        Scanner scanner_double_b = new Scanner(System.in);

        System.out.println("Please enter the operator (+,-,*,/):");
        char input_operator = scanner_operator.next().charAt(0);

            if (input_operator != '+' &&
                input_operator != '-' &&
                input_operator != '/' &&
                input_operator != '*') {
                    System.out.println("Invalid operator. Please try again.");
                    return;
              
        System.out.println("Enter the first number:");
        double input_double_a = scanner_double_a.nextDouble();
        System.out.println("Your first number is " + input_double_a);

        System.out.println("Enter the second number:");
        double input_double_b = scanner_double_b.nextDouble();
        System.out.println("Your second number is " + input_double_b);

        calculate(input_double_a, input_double_b, input_operator);

    }

    };

    public static void calculate(double a, double b, char operator) {
        double result = 0;
        switch (operator) {
            case '+':
                result = a + b;
                break;

            case '-':
                result = a - b;
                break;

            case '*':
                result = a * b;
                break;

            case '/':
                result = a / b;
                break;
        
            default:
                System.out.println("Error. Please repeat your input.");
                break;
        }

        System.out.println("The result of " + a + " " + b + " = " + result);

    }

}
