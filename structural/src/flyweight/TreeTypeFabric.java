package flyweight;

import java.util.*;

public class TreeTypeFabric {

    Map map = new HashMap();

    private static List<TreeType> treeTypes = new ArrayList<>();

    public static TreeType getTreeType(String name, String color) {
        Optional<TreeType> cache = treeTypes.stream().filter(treeType -> treeType.getName().equals(name) &&
                treeType.getColor().equals(color)).findFirst();
        if (cache.isPresent()) {
            return cache.get();
        } else {
            TreeType newTreeType = new TreeType(name, color);
            treeTypes.add(newTreeType);
            return newTreeType;
        }

    }
}
