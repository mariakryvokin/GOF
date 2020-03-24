package pureprototype;

public class Main {

    public static void main(String[] args) {
        Tree prototype = new Tree(22F,"Green","Iva");
        Tree copy = (Tree) prototype.copy();
        System.out.println(copy.getColor());
        prototype.setColor("Black");
        System.out.println(copy.getColor());
    }
}
