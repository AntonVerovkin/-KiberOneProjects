package class_package.class_collection;

import class_package.class_10.Student;

import java.util.*;

import static class_package.class_collection.CommonMethods.removeDuplicates;

public class Main {
    public static void main(String[] args) {

//        ArrayList list1 = new ArrayList<>();
//        ArrayList list2 = new ArrayList<>(10);
//        List list4 = new ArrayList<>();
//
//        ArrayList<String> ListStudentName = new ArrayList<>();
//
//        ListStudentName.add("Maria");
//        ListStudentName.add("Anton");
//        ListStudentName.add("Sas");
//        ListStudentName.add("Alena");
//        ListStudentName.add("Rostislav");
//        // System.out.println("Irina");
//
//        // System.out.println(ListStudentName);
//
//        ListStudentName.remove(2);
//
//        ListStudentName.remove("Irina");
//
//        //ListStudentName.isEmpty();
//        //ListStudentName.clear();
//        // ListStudentName.size();
//
//        //System.out.println(ListStudentName.contains("Sas"));
//
//        LinkedList<String> films = new LinkedList<>();
//
////        films.add("Star Wars:Episode 4");
////        films.add("terminator");
////        films.add("Spiderman 2");
////
////        System.out.println(films);
//
//        Set<Integer> myNumbers = new HashSet<>();
//        myNumbers.add(12);
//        myNumbers.add(34);
//        myNumbers.add(189);
//        myNumbers.add(12);
//        myNumbers.add(67);
//
//        //System.out.println(myNumbers);
//
//
//
//        Set<Student> students = new HashSet<>();
//        students.add(new Student
//                (       "Sas",
//                        "Sasow",
//                        9, 121212,
//                        "12344321",
//                        118));
//        students.add(new Student
//                (       "Mem",
//                        "Memow",
//                        918, 11212,
//                        "123554321",
//                        1181));
//        students.add(new Student
//                (       "Sas",
//                        "Sasow",
//                        9, 121212,
//                        "12344321",
//                        118));
//
//
//        System.out.println(students);
//
//
//        for (Student el: students){
//            System.out.println(el.getName());
//        }

           List<String> list = new ArrayList<>();
           list.add("apple");
           list.add("pear");
        list.add("pear");
        list.add("peach");
        list.add("peach");
        list.add("melon");

        //System.out.println(list);

        //System.out.println(removeDuplicates(list));

        List<Student> newStudents = new ArrayList<>(

        );

        newStudents.add(new Student("Biba", "Memow", 112, 1111, "1213", 12 ));
        newStudents.add(new Student("Boba", "Memow", 112, 11121, "121d3", 122 ));
        newStudents.add(new Student("Biba", "Memow", 112, 1111, "1213", 12 ));

        //System.out.println(removeDuplicates(newStudents));

        Map<String, String> map = new HashMap<>();
        map.put("12334", " Memow");
        map.put("1233_4", "Memow");
        map.put("333", "x");

        System.out.println("Set of keys: " + map.keySet());
        System.out.println("Collection of values: " + map.values());
        System.out.println("Set of entries: " + map.entrySet());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the password");
        String password = scanner.nextLine();

        map.forEach((key, value) ->
                {
                    if (key.equals(password)){
                        System.out.println("Your surname is " + value);
                    }
                }
        );

        Map<String, Student> student = new HashMap<>();
    }
    public String getPhoneNumMap(Map<String, Student> map,String userName){
        return null;
    }
}
