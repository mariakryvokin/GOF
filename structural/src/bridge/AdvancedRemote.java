package bridge;

public class AdvancedRemote extends Remote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void doSomethingSpesial(){
        System.out.println("something spesial");
    }
}
