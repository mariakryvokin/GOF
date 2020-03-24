package observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher implements Publisher{

    private List<News> news = new ArrayList<>();
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
    public void addNews(List<News> message) {
        news.addAll(message);
        notifySubscribers();
    }

    @Override
    public void notifySubscribers() {
        observers.forEach(observer -> observer.update(this));
    }

    @Override
    public List<News> getLatestNews(int amount) {
        if(amount > news.size()){
            return news;
        }else {
            return news.subList(news.size()-amount,news.size());
        }
    }
}
