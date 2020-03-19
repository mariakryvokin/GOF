package state;

public class PausedState extends State {

    public PausedState(Player player) {
        super(player);
    }


    @Override
    void play(Song song) {
        player.setState(new PlayingState(player));
        player.play(song);
    }

    @Override
    void stop() {
        System.out.println("Player is paused");
    }

    @Override
    void next() {
        System.out.println("Player is paused");
    }

    @Override
    void previous() {
        System.out.println("Player is paused");
    }
}
