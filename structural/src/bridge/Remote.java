package bridge;

import java.net.URI;

//abstraction
public class Remote {

    private Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public String turnOn(){
        return device.turnOn();
    }

    public void setDevice(Device device) {
        this.device = device;
    }
}
