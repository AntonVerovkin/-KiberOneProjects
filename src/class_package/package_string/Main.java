package class_package.package_string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        String string = "animals";
//        System.out.println(string.length());
//        System.out.println(string.charAt(0)); //a
//        System.out.println(string.charAt(3));
//        System.out.println(string.indexOf("al"));
//        System.out.println(string.indexOf("a", 3));
//
//        System.out.println(string.toUpperCase());
//        System.out.println("AniMals".toLowerCase());
//
//        System.out.println("cat".equals("CAT"));
//        System.out.println("cat".equals("cat"));
//        System.out.println("cat".equalsIgnoreCase("Cat"));
//
//        System.out.println("catcat".replace("ca", "A"));
//
//        //trim()
//        System.out.println(
//                " hello, world  " .trim()
//        );
//        //split
//        System.out.println(Arrays.toString("Hello-my-friends".split("-")));
//
//        String result = " ANimal".trim().toLowerCase().replace('m','M');
//        System.out.println(result);
//
//        String result2 = " I love cats!".trim().toUpperCase().replace("!", ":)");
//        System.out.println(result2);
//
//        // Lambda
//        List<String> list = Arrays.asList("cat", "rog", "dd");
//        System.out.println(list);

//        list.removeIf(s -> s.startsWith("r"));
//        System.out.println(list);

//        for (String s : list) {
//            System.out.println(s);
//        }
//
//
//        list.forEach(strv103 -> {
//            strv103 = strv103 + ":)";
//            System.out.println(strv103);
//        });
//
//        list.forEach(System.out::println);
//
//        List<Integer> numbers = Arrays.asList(1, 2, 3);
//
//        //numbers.forEach(n -> System.out.println(n*n));
//        numbers.replaceAll(n -> n *2);
//        System.out.println(numbers);
//
//        List<Integer> numbers2 = Arrays.asList(100, 20, 30);
//        System.out.println(numbers2);
//
//        numbers2.forEach(n -> System.out.println(n*10));

       List<String> listOfAnimals = Arrays.asList("monkey"
               , "cat", "WASSERSCHWEIN", "dog");
///        listOfAnimals.stream().filter(s -> s.startsWith("c")).forEach(System.out::println);

       //listOfAnimals.stream().limit(2).filter(s -> s.length() > 3).forEach(System.out::println);
        //listOfAnimals.stream().sorted().forEach(System.out::println);
       // listOfAnimals.stream().collect(Collectors.toSet()).forEach(System.out::println);
        //listOfAnimals.stream().collect(Collectors.toMap(el ->el,el-> el.length()));
        //System.out.println(listOfAnimals);





    }
}
