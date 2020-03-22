package adapter;
//third party class
public class Door {

    private float height;
    private boolean hasPeephole;

    public Door( boolean hasPeephole) {
        this.hasPeephole = hasPeephole;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean hasPeephole() {
        return hasPeephole;
    }

    public void setHasPeephole(boolean hasPeephole) {
        this.hasPeephole = hasPeephole;
    }
}
