package homework_package;


import java.util.Arrays;
import java.util.Scanner;

public class DZ7_EX1 {
    public static void main(String[] args) {
        int n = 4;
        String[] lines = new String[n];
        averageLines(lines);

    }
    public static String averageLines(String[] lines){
        int n = 4;
        int sum = 0;
        float average = 0.0f;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строки:");

        for (int i = 0; i < lines.length; i++) {
            lines[i] = scanner.nextLine();
            sum += lines[i].length();
        }
        System.out.println(sum);
        average = (float) sum / n;
        System.out.println(average);
        System.out.println(Arrays.toString(lines));

        for (String line : lines) {
            if (line.length() < average) {

                System.out.println(line);


            }


        }
        return averageLines(lines);
    }
}