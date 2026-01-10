package ExceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		        try {
		            int a = 10;
		            int b = 0;
		            int c = a / b;  
		            System.out.println("Result: " + c);
		        } catch (ArithmeticException e) {
		            System.out.println("Error: " + e.getMessage());
		        } finally {
		            System.out.println("This will always run");
		        }
		    }
		}

	