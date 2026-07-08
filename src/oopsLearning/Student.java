package oopsLearning;

public class Student {
    // class is blueprint of object
    String name;
    int age;
    // Encapsulation - keeps data private and expose controlled access.
    // what's the benefit for this is - protects the data, validates input, easier to maintain
    private int studentSaving;
    // Encapsulation ends
    Student (String name, int age) {
        this.name = name;
        this.age = age;
    }

    void study() {
        System.out.println("Student is Studying......");
    }

    public void setStudentSaving(int studentSaving) {
        this.studentSaving = studentSaving;
    }

    public int getStudentSaving() {
        return studentSaving;
    }
}
