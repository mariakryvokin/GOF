package mediator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Slack implements Chat {

    private Map<Integer,User> users = new HashMap<>();

    @Override
    public void sendMessage(List<Integer> userIds, String message) {
        userIds.forEach(id-> users.get(id).receiveMessage(message));
    }

    @Override
    public void addUser(User user) {
        users.putIfAbsent(user.getId(), user);
    }
}
