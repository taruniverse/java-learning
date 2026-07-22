package design_patterns.mediator;

public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User arun = new User("Arun", chatRoom);
        User diya = new User("Diya", chatRoom);

        arun.send("Hi Diya");
        diya.send("Hi Arun");
    }
}

class ChatRoom {
    void showMessage(User user, String message) {
        System.out.println(user.getName() + ": " + message);
    }
}

class User {
    private final String name;
    private final ChatRoom chatRoom;

    User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    String getName() {
        return name;
    }

    void send(String message) {
        chatRoom.showMessage(this, message);
    }
}

