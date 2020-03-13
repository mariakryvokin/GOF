package bridge;

public class TV implements Device{
    @Override
    public String start() {
        return "start";
    }

    @Override
    public String stop() {
        return "stop";
    }
}
