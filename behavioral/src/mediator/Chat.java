package mediator;

import java.util.List;

public interface Chat {

    void sendMessage(List<Integer> userIds, String message);
    void addUser(User user);
}
