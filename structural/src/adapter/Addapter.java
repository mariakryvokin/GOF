package adapter;

public class Addapter extends WindowService {

    private ThirdPartyLibraryDoorService thirdPartyLibraryDoorService;

    public Addapter(ThirdPartyLibraryDoorService thirdPartyLibraryDoorService) {
        this.thirdPartyLibraryDoorService = thirdPartyLibraryDoorService;
    }

    @Override
    public boolean seeThrough(Window window) {
        Door door = convertData(window);
        return thirdPartyLibraryDoorService.hasPeephole(door);
    }

    private Door convertData(Window window) {
        return new Door(window.isTinted());
    }
}
