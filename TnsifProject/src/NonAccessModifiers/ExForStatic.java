package NonAccessModifiers;

class Counter {
    static int count = 10;          

    Counter() {
        count++;                   
    }

    static void showCount() {      
        System.out.println("Objects created: " + count);
    }
}

public class ExForStatic {

	public static void main(String[] args) {
		    Counter c1 = new Counter();
	        Counter c2 = new Counter();
	        Counter c3 = new Counter();

	        Counter.showCount(); 
		

	}

}
