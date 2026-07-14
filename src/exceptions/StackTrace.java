package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class StackTrace {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("a.pdf");
        } catch (Exception e) {
            System.out.println("file not found");
        }

        System.out.println("Stack Trace Started");
        try {
            level1();
        } catch (Exception e) {
            e.getMessage();
            /**
             StackTraceElement[] stackTree = e.getStackTrace();

            for (int i = 0; i < stackTree.length; i++) {
                System.out.println(stackTree[i]);
            } **/
        }
    }

    public static void fileMain  () throws FileNotFoundException {
        FileReader file = new FileReader("a.pdf");
    }

    public static void level3() {
        int[] array = new int[5];
        array[5] = 10;
    }

    public static void level2 () {
        level3();
    }

    public static void level1 () {
        level2();
    }
}
