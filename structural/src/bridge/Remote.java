package bridge;

public class Remote {

    private Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public String start(){
        return device.start();
    }

    public String stop(){
        return device.stop();
    }
}
