package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Client {


    public static void main(String[] args) {
        List<Tree> oakForest = new ArrayList<>();
        TreeType greenOak = TreeTypeFabric.getTreeType("Oak","Green");
        oakForest.add(new Tree(10,10,greenOak));
        oakForest.add(new Tree(10,11,greenOak));
        oakForest.forEach(tree -> System.out.println(tree));
    }
}
