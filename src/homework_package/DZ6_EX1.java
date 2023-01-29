package homework_package;

import java.util.Arrays;
import java.util.Scanner;

public class DZ6_EX1 {
    public static void main(String[] args) {
        int n = 5;
        String[] lines = new String[n];
        System.out.println(Arrays.toString(lines));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строки: ");
        for (int i = 0; i < lines.length; i++){
            lines[i] = scanner.nextLine();
        }

        int[] Array = {lines[1].length()};
        System.out.println(Arrays.toString(Array));

        System.out.println(Arrays.toString(lines));
        System.out.println(findAverageShortestLine(lines));


    }



    public static String[] findAverageShortestLine(String[] array){

        String shortAverageString = array[0];
        int sum = 0;
        int[] Array = {array.length};
        for (int i = 0; i < array.length; i++ ){
            sum += Array[i];
        }
        int arraySum = sum / Array.length;
        String[] arrayString = {};
        for (int i = 0; i < array.length; i++){

            if (array[i].length() < arraySum){
             //    arrayString = {array[i]};
            }
        }

        return arrayString;
    }


}
