package adapter;

public class Window {

    private boolean isTinted;

    public Window(boolean isTinted) {
        this.isTinted = isTinted;
    }

    public boolean isTinted() {
        return isTinted;
    }

    public void setTinted(boolean tinted) {
        isTinted = tinted;
    }
}
