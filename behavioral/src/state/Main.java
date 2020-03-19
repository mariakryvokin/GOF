package state;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        Song loveSong = new Song("Love song");
        Song acidSong = new Song("Acid song");
        player.addSongToPlaylist(loveSong);
        Song sadSong = new Song("Sad song");
        player.addSongToPlaylist(sadSong);
        player.addSongToPlaylist(acidSong);
        State playingState = new PlayingState(player);
        player.setState(playingState);
        player.play(loveSong);
        player.next();
        player.stop();
        player.next();
        player.play(sadSong);

    }
}
