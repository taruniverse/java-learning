package design_patterns.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        SupportHandler basic = new BasicSupport();
        SupportHandler advanced = new AdvancedSupport();
        basic.setNext(advanced);

        basic.handle("password");
        basic.handle("server down");
    }
}

abstract class SupportHandler {
    private SupportHandler next;

    void setNext(SupportHandler next) {
        this.next = next;
    }

    void handle(String issue) {
        if (canHandle(issue)) {
            solve(issue);
        } else if (next != null) {
            next.handle(issue);
        } else {
            System.out.println("No handler found for " + issue);
        }
    }

    abstract boolean canHandle(String issue);

    abstract void solve(String issue);
}

class BasicSupport extends SupportHandler {
    boolean canHandle(String issue) {
        return "password".equalsIgnoreCase(issue);
    }

    void solve(String issue) {
        System.out.println("Basic support fixed " + issue);
    }
}

class AdvancedSupport extends SupportHandler {
    boolean canHandle(String issue) {
        return true;
    }

    void solve(String issue) {
        System.out.println("Advanced support fixed " + issue);
    }
}

