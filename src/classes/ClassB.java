package classes;

import java.util.Arrays;
import java.util.Scanner;

public class ClassB {
    public static void main(String[] args) {
//        printTableOfSinus(90);
//        int[] myArray = ClassArray2.createArrayWithRandomNumbers(10);
//        System.out.println(Arrays.toString(myArray));
//
//        int[] newArray = {1, 2, 3, 4};
//        System.out.println(calculateAverageArrayItem(myArray));

        int n = 4;
        String[] lines = new String[n];
        System.out.println(Arrays.toString(lines));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строки: ");
        for (int i = 0; i < lines.length; i++){
            lines[i] = scanner.nextLine();
        }

        System.out.println(Arrays.toString(lines));
        System.out.println(findShortestLine(lines));
    }

    public static void printTableOfSinus(int interval){
        for (int i = 0; i <= 360; i += interval){
            System.out.println( "sin "+ i + " градус =  " + Math.sin(i));
        }
        System.out.println(Math.sin(0));
    }

    public static int calculateAverageArrayItem(int[] array){
       int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum / array.length;
    }

    public static String findShortestLine(String[] array){
        String shortString = array[0];
        for (String s : array){

            if (shortString.length() > s.length()){
                shortString = s;
            }
        }
        return shortString;
    }
}
