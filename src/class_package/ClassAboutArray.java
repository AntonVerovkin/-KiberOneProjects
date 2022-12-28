package class_package;

import java.util.Arrays;

public class ClassAboutArray {
    public static void main(String[] args) {
//        int[] arrayInt = {1, 2, 3};
//        //System.out.println(arrayInt[1]);
//
//        String[] nameOfStudents = {
//                "Антон",
//                "Маша",
//                "Ростислав",
//                "Алена"
//        };
//        //System.out.println(nameOfStudents[0]);
//        //System.out.println(nameOfStudents[1]);
//        //System.out.println(nameOfStudents[2]);
//        //System.out.println(nameOfStudents[3]);
//        //String[] solSystemPlanets = {
//                "Меркурий",
//                "Венера",
//                "Земля",
//                "Марс",
//                "Юпитер",
//                "Сатурн",
//                "Уран",
//                "Нептун",
//        };
//        //System.out.println(solSystemPlanets[2] + " на этой планета я живу");
//        int[] myArray;
//
//        myArray = new  int[3];
//        myArray[0] = 100;
//        myArray[1] = 200;
//        myArray[2] = 300;
//
//        //System.out.println("Element at index0: " + myArray[0]);
//
//        String myString = "Ivan Ivanovich Ivanov";
//        String[] words = myString.split(" ");
//        System.out.println(Arrays.toString(words));
//
//        char[] charArray = "Ivan".toCharArray();
//        System.out.println(charArray[2]);
//
//        char c1 = 'A';
//        System.out.println(c1);
//        char c2 = 65;
//        System.out.println(c2);

        String[][] names = {
                {"Mr.", "Mrs.", "Ms.", "Miss." },
                {"Ivanov", "Jones", "Sidorov"}
        };
        //Ms.Jones
        System.out.println(names[0][2] + names[1][1]);
        // Mr. Sidorov
        System.out.println("Hello" + " " + names[0][0]
        + " " + names[1][2] + "!"
        );
    }
}
