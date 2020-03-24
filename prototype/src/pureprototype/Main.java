package pureprototype;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree(22F,"Green","Iva");
        Tree prototype = (Tree) tree.copy();
        System.out.println(prototype.getColor());
    }
}
