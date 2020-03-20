package templatemethod;

public abstract class SocialNetwork {

    public void post(Post post){
        if(logIn(post.getUser())){
            sendData(post.getDescription());
            logOut(post.getUser());
        }else {
            System.out.println("Please login");
        }

    }

    protected abstract boolean logIn(User user);
    abstract void sendData(String data);
    abstract void logOut(User user);

}
