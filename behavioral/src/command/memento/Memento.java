package command.memento;

public class Memento {

    private String context;

    public Memento(String context) {
        this.context = context;
    }

    public String getContext() {
        return context;
    }
}
