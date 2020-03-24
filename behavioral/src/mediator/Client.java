package mediator;

import java.util.Collections;

public class Client {

    public static void main(String[] args) {
        Chat chat = new Slack();
        User firstUser = new User(1, chat);
        User secondUser = new User(2, chat);
        chat.addUser(firstUser);
        chat.addUser(secondUser);

        firstUser.sentMessage(Collections.singletonList(secondUser.getId()), "hi");
    }
}
