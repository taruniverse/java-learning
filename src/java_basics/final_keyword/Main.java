package java_basics.final_keyword;

public class Main {
    public static void main(String[] args) {
        Exam exam = new Exam();
        exam.showMaxMarks();
    }
}

final class Exam {
    private final int maxMarks = 100;

    final void showMaxMarks() {
        System.out.println("Max marks: " + maxMarks);
    }
}

