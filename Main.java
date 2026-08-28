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

    };

    public static void calculate(double a, double b, char operator) {
        double result;
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
                break;
        }

        
    }

}