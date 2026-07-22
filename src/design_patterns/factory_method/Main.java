package design_patterns.factory_method;

public class Main {
    public static void main(String[] args) {
        Notification email = NotificationFactory.create("email");
        Notification sms = NotificationFactory.create("sms");

        email.send("Welcome to design patterns");
        sms.send("Your OTP is 1234");
    }
}

interface Notification {
    void send(String message);
}

class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SmsNotification implements Notification {
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class NotificationFactory {
    static Notification create(String type) {
        if ("email".equalsIgnoreCase(type)) {
            return new EmailNotification();
        }
        if ("sms".equalsIgnoreCase(type)) {
            return new SmsNotification();
        }
        throw new IllegalArgumentException("Unknown notification type: " + type);
    }
}

