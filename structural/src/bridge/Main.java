package bridge;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Device device = new TV(Collections.singletonList("first channel"));
        Remote remote = new Remote(device);
        System.out.println(remote.turnOn());
    }
}
