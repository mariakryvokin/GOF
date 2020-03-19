package observer;

public interface Publisher {

    void subscribe(Observer observer);
    void unSubscribe(Observer observer);
    void notify(Message message);
}
