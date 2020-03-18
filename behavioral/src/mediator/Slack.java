package mediator;

import java.util.HashMap;
import java.util.Map;

public class Slack implements Chat {

    private Map<Integer,User> users = new HashMap<>();

    @Override
    public void sendEmail(User user, String message) {
        users.get(user.getId()).receiveMessage(message);
    }

    @Override
    public void addUser(User user) {
        users.putIfAbsent(user.getId(), user);
    }
}
