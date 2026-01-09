package Polymorphism;   

public class AccessModifiers {
	
      private int a = 40;      
     int b = 60;     
     protected int c = 20;    
     public int d = 40;
     
     public void showDetails() {
    	 System.out.println("private a = "+a);
    	 System.out.println(" b = "+b);
    	 System.out.println("protected c = "+c);
    	 System.out.println("public d = "+d);
     }
     
    public static void main(String[] args) {
    	
    	AccessModifiers a = new AccessModifiers();
    	a.showDetails();
    	
    	
           }
}