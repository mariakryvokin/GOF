package mediator;

public class User {

    protected Integer id;

    protected Chat moderator;

    public User(Integer id, Chat moderator) {
        this.id = id;
        this.moderator = moderator;
    }

    public void sentMessage(User user, String message){
        moderator.sendEmail(user, message);
    }
    public void receiveMessage(String message){
        System.out.println("User with id: " + getId() + " recieved message: " + message);
    }

    public Integer getId() {
        return id;
    }
}
