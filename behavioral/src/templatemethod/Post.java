package templatemethod;

public class Post {

    private String description;
    private User user;

    public Post(String description, User user) {
        this.description = description;
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public User getUser() {
        return user;
    }
}
