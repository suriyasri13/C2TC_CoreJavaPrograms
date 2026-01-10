package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> students = new LinkedList<>();
        
      
        students.add("suriya");
        students.add("sri");
        students.add("vijay");
        
        System.out.println("After adding (Queue):");
        for (String s : students) {
            System.out.println(s);
        }
        
      
        students.add("Meena");
        System.out.println("\nAfter adding Meena:");
        for (String s : students) {
            System.out.println(s);
        }
        
    
        String first = students.remove();
        System.out.println("\nDequeued: " + first);
        System.out.println("Remaining queue:");
        for (String s : students) {
            System.out.println(s);
        }
        
     
        System.out.println("\nPeek first: " + students.peek());
        
        System.out.println("\nSize: " + students.size());
        System.out.println("Is empty? " + students.isEmpty());
    }
}
