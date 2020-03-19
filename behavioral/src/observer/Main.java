package observer;

public class Main {

    public static void main(String[] args) {
        Observer observer = new Subscriber();

        Publisher publisher = new NewsPublisher();

        publisher.subscribe(observer);
        publisher.notify(new Message(" hi!"));
    }
}
