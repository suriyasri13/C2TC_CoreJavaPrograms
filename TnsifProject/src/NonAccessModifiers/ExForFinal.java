package NonAccessModifiers;

final class Vehicle {
    
    final int MAX_SPEED = 110;

    
    final void showSpeed() {
        System.out.println("Max speed = " + MAX_SPEED);
    }
}


public class ExForFinal {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
        v.showSpeed();
		

	}

}
