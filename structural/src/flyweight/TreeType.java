package flyweight;


//repeated part
public class TreeType {

    private String name;
    private String color;

    public TreeType(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "TreeType{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
