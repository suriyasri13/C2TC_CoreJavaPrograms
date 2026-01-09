package Polymorphism;

public class MethodOverloading {
	
	int add(int a, int b, int c) {
        return a + b + c;
	}
	
	double add(double a, double b) {
        return a + b;
	}
	
	int add(int a, double b) {
        return (int)(a + b);
	}
	

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		System.out.println("add is:"+mo.add(2,1,4));
		System.out.println("add is:"+mo.add(4.2,2.5));
		System.out.println("add is:"+mo.add(6,7.2));

	}

}
