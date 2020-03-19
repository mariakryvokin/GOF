package state;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private State state;

    private List<Song> playlist = new ArrayList<>();

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<Song> getPlaylist() {
        return playlist;
    }

    public void addSongToPlaylist(Song song){
        playlist.add(song);
    }

    public void play(Song song){
        state.play(song);
    }
    public void next(){
        state.next();
    }
    public void previous(){
        state.previous();
    }

    public void stop(){
        state.stop();
    }
}
