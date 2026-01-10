package ExceptionHandling;

public class Finallyblock {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;  // Throws ArithmeticException
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block: This always executes");
        }
        System.out.println("Program continues...");
    }
}
