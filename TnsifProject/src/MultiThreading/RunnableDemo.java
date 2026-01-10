package MultiThreading;


class MyRunnable implements Runnable {
    
    public void run() {
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child thread (Runnable): " + i);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        System.out.println("Main thread starts");

        MyRunnable task = new MyRunnable();  

        Thread t = new Thread(task);         

        t.start();                     

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
        }

        System.out.println("Main thread ends");
    }
}
