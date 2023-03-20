package homework_package.DZ8;

import java.util.HashSet;
import java.util.Set;

public class DZ14EX1 {
    public static void main(String[] args) {
        Set<Integer> collection = new HashSet<>();
        collection.add(32);
        collection.add(323);
        collection.add(32);
        collection.add(332);
        collection.add(3333);
        collection.add(324);
        collection.add(3234);
        collection.add(323);
        collection.add(3323);
        collection.add(33334);

        System.out.println(collection);
    }
}
