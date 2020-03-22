package bridge;

import java.util.ArrayList;
import java.util.List;

public class TV implements Device{

    private List<String> channels = new ArrayList<>();
    private String lastVisitedChannel;

    public TV(List<String> channels) {
        this.channels = channels;
    }

    @Override
    public String turnOn() {
        startTV();
        if (lastVisitedChannel != null){
            return lastVisitedChannel;
        }else{
            lastVisitedChannel = channels.get(0);
            return channels.get(0);
        }
    }

    public void startTV(){
        System.out.println("TV started");
    }
}
