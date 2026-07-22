package design_patterns.interpreter;

public class Main {
    public static void main(String[] args) {
        Expression java = new WordExpression("Java");
        Expression pattern = new WordExpression("pattern");
        Expression rule = new AndExpression(java, pattern);

        System.out.println(rule.interpret("Java design pattern notes"));
    }
}

interface Expression {
    boolean interpret(String text);
}

class WordExpression implements Expression {
    private final String word;

    WordExpression(String word) {
        this.word = word;
    }

    public boolean interpret(String text) {
        return text.contains(word);
    }
}

class AndExpression implements Expression {
    private final Expression first;
    private final Expression second;

    AndExpression(Expression first, Expression second) {
        this.first = first;
        this.second = second;
    }

    public boolean interpret(String text) {
        return first.interpret(text) && second.interpret(text);
    }
}

