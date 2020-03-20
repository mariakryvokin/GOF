package templatemethod;

public class Main {

    public static void main(String[] args) {
        SocialNetwork facebook = new Facebook();
        User user = new User("name","password");
        Post post = new Post("First post",user);
        facebook.post(post);
        SocialNetwork twitter = new Twitter();
        twitter.post(post);
        ((Twitter) twitter).registerUser(user);
        twitter.post(post);
    }
}
