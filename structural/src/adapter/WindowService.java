package adapter;

public class WindowService {

    boolean seeThrough(Window window){
        return ! window.isTinted();
    }
}
