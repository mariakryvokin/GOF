package pureprototype;

public final class Tree implements Prototype {

    private float height;
    private String color;
    private String name;

    public Tree(float height, String color, String name) {
        this.height = height;
        this.color = color;
        this.name = name;
    }

    public Tree(Tree prototype){
        this.height = prototype.getHeight();
        this.color = prototype.getColor();
        this.name = prototype.getName();
    }

    @Override
    public Prototype copy() {
        return new Tree(this);
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
