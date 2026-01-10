package Collection;

import java.util.HashSet;

public class HashsetDemo {
    public static void main(String[] args) {
        HashSet<String> students = new HashSet<>();
        
     
        students.add("suriya");
        students.add("sri");
        students.add("vijay");
        students.add("sri");  
        
        System.out.println("After adding:");
        for (String s : students) {
            System.out.println(s);
        }
        
        // Add new element
        students.add("Meena");
        System.out.println("\nAfter adding Meena:");
        for (String s : students) {
            System.out.println(s);
        }
        
        
        System.out.println("\nContains 'vijay': " + students.contains("vijay"));
        
      
        students.remove("sri");
        System.out.println("\nAfter removing sri:");
        for (String s : students) {
            System.out.println(s);
        }
        
        System.out.println("\nSize: " + students.size());
        System.out.println("Is empty? " + students.isEmpty());
    }
}
