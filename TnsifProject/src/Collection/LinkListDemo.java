package Collection;

import java.util.LinkedList;

public class LinkListDemo {
    public static void main(String[] args) {

      
        LinkedList<String> students = new LinkedList<>();

     
        students.add("sri");
        students.add("vijay");
        students.add("Ram");

        System.out.println("After adding:");
        for (String s : students) {
            System.out.println(s);
        }

        
        students.add(1, "Meena");   

        System.out.println("\nAfter adding Meena at index 1:");
        for (String s : students) {
            System.out.println(s);
        }

        // Add at first and last
        students.addFirst("First");
        students.addLast("Last");

        System.out.println("\nAfter addFirst and addLast:");
        for (String s : students) {
            System.out.println(s);
        }

      
        System.out.println("\nFirst element: " + students.getFirst());
        System.out.println("Last element: " + students.getLast());
        System.out.println("Element at index 2: " + students.get(2));

       
        students.removeFirst();
        students.removeLast();   
        students.remove(1);      

        System.out.println("\nAfter removals:");
        for (String s : students) {
            System.out.println(s);
        }

     
        System.out.println("\nSize: " + students.size());
        System.out.println("Is empty? " + students.isEmpty());
    }
}
