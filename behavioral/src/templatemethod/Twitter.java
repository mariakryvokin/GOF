package templatemethod;

import java.util.HashMap;
import java.util.Map;

public class Twitter extends SocialNetwork {

    private Map<String, User> users = new HashMap<>();

    public void registerUser(User user){
        users.put(user.getUsername(),user);
    }

    @Override
    protected boolean logIn(User user) {
        return users.containsKey(user.getUsername());
    }

    @Override
    void sendData(String data) {
        System.out.println(data);
    }

    @Override
    void logOut(User user) {
        System.out.println("you are logged out from Twitter");
    }
}
