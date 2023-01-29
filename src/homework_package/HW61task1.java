package homework_package;

import java.util.Arrays;
import java.util.Scanner;

public class HW61task1 {
    public static void main(String[] args) {

//        int n = 4;
//        String[] lines = new String[n];
//        int sum = 0;
//        float average = 0.0f;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите строки:");
//
//        for (int i = 0; i < lines.length; i++) {
//            lines[i] = scanner.nextLine();
//            sum += lines[i].length();
//        }
//        System.out.println(sum);
//        average = ( float) sum / n;
//
//        System.out.println(average);
//
//        for (int i = 0; i < lines.length; i++){
//            if (lines[i].length() < average){
//                System.out.println(lines[i]);
//            }
//        }


        int n = 4;
        String keyword = "hello";
        String[] lines = new String[n];
        String keyword2 = "friends";

        int[] digits = new int[n];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строки:");
        for (int i = 0; i <lines.length; i++){
            lines[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(lines));

        for (int i = 0; i < lines.length; i++){
            if (lines[i].contains(keyword) ){
                System.out.println("String: \""  +  lines[i] + "\" contains " + keyword);
            }
        }

        for (String line : lines) {
            if (line.contains(keyword) || line.contains(keyword2)) {
                System.out.println("String: \"" + line + "\" contains " + keyword);
            }
        }
        // логическое И &
        // логическое ИЛИ ||
    }
}
