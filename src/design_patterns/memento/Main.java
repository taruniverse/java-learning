package design_patterns.memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.setText("First version");
        TextMemento saved = editor.save();

        editor.setText("Second version");
        System.out.println(editor.getText());

        editor.restore(saved);
        System.out.println(editor.getText());
    }
}

class TextMemento {
    private final String text;

    TextMemento(String text) {
        this.text = text;
    }

    String getText() {
        return text;
    }
}

class TextEditor {
    private String text = "";

    void setText(String text) {
        this.text = text;
    }

    String getText() {
        return text;
    }

    TextMemento save() {
        return new TextMemento(text);
    }

    void restore(TextMemento memento) {
        text = memento.getText();
    }
}

