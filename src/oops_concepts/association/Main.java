package oops_concepts.association;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Neha");
        Course course = new Course("Java");

        teacher.teach(course);
    }
}

class Teacher {
    private final String name;

    Teacher(String name) {
        this.name = name;
    }

    void teach(Course course) {
        System.out.println(name + " teaches " + course.getName());
    }
}

class Course {
    private final String name;

    Course(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

