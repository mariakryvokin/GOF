package bridge;

//abstraction
public class Remote {

    private Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public String turnOn(){
        return device.turnOn();
    }
}
