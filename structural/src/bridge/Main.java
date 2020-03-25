package bridge;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Device device = new TV(Collections.singletonList("first channel"));
        Device electroCar = new ElectroCar();
        Remote remote = new Remote(device);
        System.out.println(remote.turnOn());
        remote.setDevice(electroCar);
        System.out.println(remote.turnOn());
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.doSomethingSpesial();
    }
}
