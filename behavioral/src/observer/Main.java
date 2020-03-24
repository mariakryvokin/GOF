package observer;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Observer observer = new Subscriber();

        Publisher publisher = new NewsPublisher();

        publisher.subscribe(observer);
        publisher.addNews(Arrays.asList(new News("First News"),
                new News("Second News")));
        publisher.addNews(Collections.singletonList(new News("Third News")));
    }
}
