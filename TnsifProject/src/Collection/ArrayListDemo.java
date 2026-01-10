package Collection;

import java.util.ArrayList;

public class ArrayListDemo {         
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("sri");
        students.add("vijay");
        students.add("Ram");

        System.out.println("After adding:");
        for (String s : students) {
            System.out.println(s);
        }

        students.add(1, "jo");

        System.out.println("\nAfter adding Meena at index 1:");
        for (String s : students) {
            System.out.println(s);
        }
    }
}
