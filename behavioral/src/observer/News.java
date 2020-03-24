package observer;

public class News {
    private String context;

    public News(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "News{" +
                "context='" + context + '\'' +
                '}';
    }
}
