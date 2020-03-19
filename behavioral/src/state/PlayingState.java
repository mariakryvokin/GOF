package state;

public class PlayingState extends State {

    public PlayingState(Player player) {
        super(player);
    }

    @Override
    public void play(Song song) {
        current = song;
        System.out.println(player.getPlaylist().get(player.getPlaylist().indexOf(song)));
    }

    @Override
    void stop() {
        player.setState(new PausedState(player));
    }

    @Override
    public void next() {
        int nextSongIndex = player.getPlaylist().indexOf(current) + 1;
        if(nextSongIndex > player.getPlaylist().size()){
            nextSongIndex = 0;
        }
        System.out.println(player.getPlaylist().get(nextSongIndex));
    }

    @Override
    public void previous() {
        int previousSongIndex = player.getPlaylist().indexOf(current) -1;
        if(previousSongIndex < 0){
            previousSongIndex = 0;
        }
        System.out.println(player.getPlaylist().get(previousSongIndex));
    }
}
