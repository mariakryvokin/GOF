package observer;

public class Message {
    private String context;

    public Message(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "Message{" +
                "context='" + context + '\'' +
                '}';
    }
}
