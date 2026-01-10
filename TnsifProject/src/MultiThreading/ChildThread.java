package MultiThreading;

class MyChild extends Thread {
    @Override
    public void run() {
       
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child thread: " + i);
        }
    }
}

public class ChildThread {
    public static void main(String[] args) {
        System.out.println("Main thread starts");

        
        MyChild t = new MyChild();

       
        t.start();

     
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
        }

        System.out.println("Main thread ends");
    }
}
