package oops_concepts.constructor;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Clean Code", "Robert Martin");
        book.show();
    }
}

class Book {
    private final String title;
    private final String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void show() {
        System.out.println(title + " by " + author);
    }
}

