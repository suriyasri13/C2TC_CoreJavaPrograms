package ExceptionHandling;

public class WithoutException {

	public static void main(String[] args) {
	
        try {
            int x = 10 / 0;   
        } catch (ArithmeticException e) {
            System.out.println("Something went wrong");
        }

	}

}
