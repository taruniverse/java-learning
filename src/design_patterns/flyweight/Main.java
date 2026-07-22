package design_patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TreeType mangoType1 = TreeTypeFactory.getTreeType("Mango", "Green");
        TreeType mangoType2 = TreeTypeFactory.getTreeType("Mango", "Green");

        System.out.println(mangoType1 == mangoType2);
        mangoType1.draw(10, 20);
    }
}

class TreeType {
    private final String name;
    private final String color;

    TreeType(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void draw(int x, int y) {
        System.out.println(name + " tree with " + color + " leaves at " + x + ", " + y);
    }
}

class TreeTypeFactory {
    private static final Map<String, TreeType> CACHE = new HashMap<>();

    static TreeType getTreeType(String name, String color) {
        String key = name + "-" + color;
        if (!CACHE.containsKey(key)) {
            CACHE.put(key, new TreeType(name, color));
        }
        return CACHE.get(key);
    }
}

