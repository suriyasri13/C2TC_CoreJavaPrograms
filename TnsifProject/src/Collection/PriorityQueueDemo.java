package Collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> students = new PriorityQueue<>();
        
        
        students.add("suriya");
        students.add("sri");
        students.add("vijay");
        
        System.out.println("After adding:");
        for (String s : students) {
            System.out.println(s);
        }
        
        
        students.add("Meena");
        System.out.println("\nAfter adding Meena:");
        for (String s : students) {
            System.out.println(s);
        }
        
      
        String first = students.poll();
        System.out.println("\nRemoved first (highest priority): " + first);
        System.out.println("Remaining priority queue:");
        for (String s : students) {
            System.out.println(s);
        }
        
  
        System.out.println("\nPeek next: " + students.peek());
        
       
        System.out.println("\nSize: " + students.size());
        System.out.println("Is empty? " + students.isEmpty());
    }
}
