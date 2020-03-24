package observer;

public class Subscriber implements Observer {
    @Override
    public void update(Publisher publisher) {
        System.out.println("was notified with message: " + publisher.getLatestNews(2));
    }
}
