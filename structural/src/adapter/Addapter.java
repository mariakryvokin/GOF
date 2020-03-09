package adapter;

public class Addapter implements WindowService  {

    private ThirdPartyLibraryDoorService thirdPartyLibraryDoorService;

    public Addapter(ThirdPartyLibraryDoorService thirdPartyLibraryDoorService) {
        this.thirdPartyLibraryDoorService = thirdPartyLibraryDoorService;
    }

    @Override
    public boolean seeThrough() {
        return thirdPartyLibraryDoorService.canLock();
    }
}
