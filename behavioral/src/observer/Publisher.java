package observer;

import java.util.List;

public interface Publisher {

    void subscribe(Observer observer);
    void unSubscribe(Observer observer);
    void addNews(List<News> message);
    void notifySubscribers();
    List<News> getLatestNews(int amount);
}
