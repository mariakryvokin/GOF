package state;

public class Song {

    private String name;

    public Song(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                '}';
    }
}
