package variables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class variables {
    // need to learn the modifiers in java both access/non-access modifier
    static String global_name = "Class Name"; // these are instance variables or Belongs to object.
    static int global_age = 24; // these are instance variables or Belongs to object.
    // static (shared by everyone)
    // Data Types - everything in java  has a datatype, because java needs to know memory, operations allowed, storage size. - Primitive and Reference
    // Primitive - byte (1 byte) - short (2 bytes) - int (4 bytes) - long (8 bytes) - float (4 bytes) - double (8 bytes) - char (2 bytes) - boolean (1 but logical)

    /** Primitive (stores actual value) example - int age = 34; - Reference (stores address) example - Student s = new Student();
     * in memory it is stored primitive - age - 24 but for reference s ---> Object;
     * @param args
     */

    /** Type Casting - sometimes we need to convert types
     * example int = double ----> int age = 24; ---> double d = age; ---> output - 24.0; and vise-versa
     * **/
    public static void main(String[] args) {
        // local variables which are inside method
        int age = 24;
        String name = "Tarun Gupta";
        char single_character = 'T';
        double salary = 50000.63;
        System.out.println("local variable age " + age);
        System.out.println("local variable name " + name);
        System.out.println("local variable single char " + single_character);
        System.out.println("local variable salary " + salary);
        System.out.println("global variable name " + global_name);
        System.out.println("global variable name " + global_age);

        // Collections - collections stores multiple objects.
        /** suppose you have 100 students
         * bad - student1 student2
         * correct  - List<Student>
         * **/
        // Array
        /** fixed size
         * int[] arr = {1,2,3,4} this cannot grow.
         * **/
        // Array List
        /** Most common - below is the example
         * **/
        ArrayList<String> names = new ArrayList<>();
        names.add("Tarun");
        names.add("Aman");
        names.add("Siddharth");
        System.out.println("ArrayList check " + names);
        names.remove(0);
        System.out.println("ArrayList check " + names);
        System.out.println("ArrayList check " + names.size());
        // Linked List - better when inserting many elements
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Linked List check " + list);
        // Hashset - no duplicates
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Java");
        System.out.println("HashSet check " + set);
        // HashMap - stores key-value pairs
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Tarun", 89);
        marks.put("Aman", 89);
        System.out.println("HashMap Check " + marks);
        System.out.println("HashMap Check " + marks.get("Tarun"));
    }
}
