package oops_concepts.class_object;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Tarun", 24);
        Student student2 = new Student("Asha", 21);

        student1.introduce();
        student2.introduce();
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}

