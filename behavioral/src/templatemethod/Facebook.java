package templatemethod;

public class Facebook extends SocialNetwork {
    @Override
    protected boolean logIn(User user) {
        return true;
    }

    @Override
    void sendData(String data) {
        System.out.println(data);
    }

    @Override
    void logOut(User user) {
        System.out.println("you are logged out from Facebook");
    }
}
