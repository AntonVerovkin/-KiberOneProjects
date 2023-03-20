package class_package.class_collection;

import class_package.class_10.Student;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

public class CommonMethods {
    public static Collection<Student> removeDuplicates(Collection<Student
            > collection){
//        HashSet<String> sortedCollection = new HashSet<>(collection);
//    return sortedCollection;

    return new HashSet<>(collection);
    }


}
