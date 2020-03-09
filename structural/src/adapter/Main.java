package adapter;

public class Main {

    public static void main(String[] args) {
        WindowService windowService = new Addapter(new ThirdPartyLibraryDoorService());
        System.out.println(windowService.seeThrough());
    }
}
