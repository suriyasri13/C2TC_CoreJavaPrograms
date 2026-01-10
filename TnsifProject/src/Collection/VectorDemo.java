package Collection;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

       
        Vector<String> students = new Vector<>();

        
        students.add("suriya");
        students.add("sri");
        students.add("vijay");

        System.out.println("After adding:");
        for (String s : students) {
            System.out.println(s);
        }

     
        students.add(1, "Meena");  

        System.out.println("\nAfter adding Meena at index 1:");
        for (String s : students) {
            System.out.println(s);
        }

     
        String first = students.get(0);
        System.out.println("\nFirst element: " + first);

       
        students.set(0, "jo");
        System.out.println("\nAfter replacing first element with Priya:");
        for (String s : students) {
            System.out.println(s);
        }

        
        students.remove(2);   

        System.out.println("\nAfter removing index 2:");
        for (String s : students) {
            System.out.println(s);
        }

        
        System.out.println("\nSize: " + students.size());
        System.out.println("Is empty? " + students.isEmpty());
        System.out.println("Capacity: " + students.capacity());
    }
}
