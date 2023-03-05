package class_package.class_collection;

import class_package.class_10.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList list1 = new ArrayList<>();
        ArrayList list2 = new ArrayList<>(10);
        List list4 = new ArrayList<>();

        ArrayList<String> ListStudentName = new ArrayList<>();

        ListStudentName.add("Maria");
        ListStudentName.add("Anton");
        ListStudentName.add("Sas");
        ListStudentName.add("Alena");
        ListStudentName.add("Rostislav");
        // System.out.println("Irina");

        // System.out.println(ListStudentName);

        ListStudentName.remove(2);

        ListStudentName.remove("Irina");

        //ListStudentName.isEmpty();
        //ListStudentName.clear();
        // ListStudentName.size();

        //System.out.println(ListStudentName.contains("Sas"));

        LinkedList<String> films = new LinkedList<>();

//        films.add("Star Wars:Episode 4");
//        films.add("terminator");
//        films.add("Spiderman 2");
//
//        System.out.println(films);

        Set<Integer> myNumbers = new HashSet<>();
        myNumbers.add(12);
        myNumbers.add(34);
        myNumbers.add(189);
        myNumbers.add(12);
        myNumbers.add(67);

        //System.out.println(myNumbers);



        Set<Student> students = new HashSet<>();
        students.add(new Student
                (       "Sas",
                        "Sasow",
                        9, 121212,
                        "12344321",
                        118));
        students.add(new Student
                (       "Mem",
                        "Memow",
                        918, 11212,
                        "123554321",
                        1181));
        students.add(new Student
                (       "Sas",
                        "Sasow",
                        9, 121212,
                        "12344321",
                        118));


        System.out.println(students);


        for (Student el: students){
            System.out.println(el.getName());
        }



    }
}
