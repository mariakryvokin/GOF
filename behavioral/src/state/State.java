package state;

public abstract class State {

    protected Player player;
    protected Song current;

    public State(Player player) {
        this.player = player;
    }

    abstract void play(Song song);
    abstract void stop();
    abstract void next();
    abstract void previous();
}
