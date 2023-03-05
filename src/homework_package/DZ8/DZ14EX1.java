package homework_package.DZ8;

import java.util.HashSet;
import java.util.Set;

public class DZ14EX1 {
    public static void main(String[] args) {
        Set<Integer> Collection = new HashSet<>();
        Collection.add(32);
        Collection.add(323);
        Collection.add(32);
        Collection.add(332);
        Collection.add(3333);
        Collection.add(324);
        Collection.add(3234);
        Collection.add(323);
        Collection.add(3323);
        Collection.add(33334);

        System.out.println(Collection);
    }
}
