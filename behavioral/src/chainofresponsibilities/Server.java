package chainofresponsibilities;

import java.util.HashMap;

public class Server {

    private HashMap<String, String> userPassword = new HashMap<>();

    private HashMap<String, String> userNameRole = new HashMap<>();
    public boolean authenticate(String userName, String password){
        return userPassword.containsKey(userName) && userPassword.get(userName).equals(password);
    }

    public boolean authorize(String userName, String role){
        return userNameRole.containsKey(userName) && userNameRole.get(userName).equals(role);
    }

    public HashMap<String, String> getUserPassword() {
        return userPassword;
    }

    public HashMap<String, String> getUserNameRole() {
        return userNameRole;
    }
}
