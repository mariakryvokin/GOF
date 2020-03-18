package mediator;

public class User {

    protected Integer id;

    protected Chat mediator;

    public User(Integer id, Chat mediator) {
        this.id = id;
        this.mediator = mediator;
    }

    public void sentMessage(User user, String message){
        mediator.sendEmail(user, message);
    }
    public void receiveMessage(String message){
        System.out.println("User with id: " + getId() + " recieved message: " + message);
    }

    public Integer getId() {
        return id;
    }
}
