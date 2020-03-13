package bridge;

public class Main {

    public static void main(String[] args) {
        Device device = new TV();
        Remote remote = new Remote(device);
        System.out.println(remote.start());
    }
}
