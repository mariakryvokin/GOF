package observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher implements Publisher{


    private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(Message message) {
        observers.forEach(observer -> observer.notify(message));
    }
}
