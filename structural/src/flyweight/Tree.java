package flyweight;

//unique part
public class Tree {

    private double x;
    private double y;

    private TreeType treeType;

    public Tree(double x, double y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "x=" + x +
                ", y=" + y +
                ", treeType=" + treeType +
                '}';
    }
}
