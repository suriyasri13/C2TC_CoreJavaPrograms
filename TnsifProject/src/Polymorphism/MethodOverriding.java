package Polymorphism;

class Vehicle {
    void run() {                          
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    void run() {                       
        System.out.println("Car is running in fuel");
    }
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		v.run();
		
		Car c = new Car();
		c.run();
		
		Vehicle obj = new Vehicle();
		 obj.run();

	}

}
