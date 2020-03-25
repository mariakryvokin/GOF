package bridge;

public class ElectroCar implements Device {
    @Override
    public String turnOn() {
        return "car was turned on";
    }
}
