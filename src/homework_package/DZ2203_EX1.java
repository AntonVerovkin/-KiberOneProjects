package homework_package;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DZ2203_EX1 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apricot", "pear", "grapes");
        //fruits.stream().filter(s -> s.startsWith("a")).forEach(System.out::println);
        fruits.stream().filter(s -> s.length() > 4).forEach(System.out::println);
        int sumOfThreeEl = fruits.stream().limit(3).mapToInt(String::length).sum();
        System.out.println(sumOfThreeEl);
    }
}