package exceptions;

import oopsLearning.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exception Class Started");
        int[] numerator = {10, 200, 30, 40};
        int[] denominator = {1, 2, 0, 2};
//        for (int i = 0; i < 10; i++) { // length - denominator.length which is now 10s
//            try {
//                System.out.println(divide(numerator[i], denominator[i]));
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println(e);
//            }
//        };
        read();
    }

    public static int divide(int n, int d) {
        try {
//            Student s1 = null;
//            s1.setStudentSaving(1223);
//            System.out.println(s1.getStudentSaving());
            return n / d;
        } catch (NullPointerException e) {
            System.out.println(e);
            return -1;
        } catch (ArithmeticException e) {
            System.out.println(e);
            return -1;
        } catch (RuntimeException e) {
            System.out.println(e);
            return -1;
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        } finally {
            System.out.println("Bye");
        }
    }

    public static void read() {
        try(BufferedReader reader = new BufferedReader(new FileReader("example.pdf"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("IO Exception - " + e.getMessage());
        }
        /**
         * finally {
         *             try {
         *                 if (reader != null) {
         *                     reader.close();
         *                 }
         *             } catch (IOException o) {
         *                 System.out.println("Error Closing reader: " + o.getMessage());
         *             }
         *         }
         */
    }
}
