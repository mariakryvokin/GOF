package observer;

public class Subscriber implements Observer {
    @Override
    public void notify(Message message) {
        System.out.println("was notified with message: " + message);
    }
}
