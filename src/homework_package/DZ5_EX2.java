package homework_package;

import java.util.Arrays;
import java.util.Random;

public class DZ5_EX2 {
    public static void main(String[] args) {




        int[] myArray = createArrayWithRandomNumbers2(10);
        //Контрольный вывод
        System.out.println(Arrays.toString(myArray));

        int lengthOfArray = 0;
        System.out.println(Arrays.toString(averageOfArrayMethod(myArray, lengthOfArray)));
    }

    private static int[] averageOfArrayMethod(int[] myArray, int  lengthOfArray) {
        int[] arrayOfNumber = new int[lengthOfArray];
        int sum = 0;
        for (int i = 1; i < arrayOfNumber.length; i++) {
            sum = sum + arrayOfNumber[i];
        }
        int averageOfArray = sum /= arrayOfNumber.length;
        return arrayOfNumber;
    }

    public static int[] createArrayWithRandomNumbers2(int lengthOfArray) {
        int[] arrayOfNumber = new int[lengthOfArray];

        for (int i = 0; i < arrayOfNumber.length; i++) {
            Random vbr2_0 = new Random();
            arrayOfNumber[i] = vbr2_0.nextInt(1000);
        }

        return arrayOfNumber;
    }

    public static int[] averageOfArrayMethod(int[] arrayOfNumbers, int lengthOfArray, int averageOfArray) {
        int[] arrayOfNumber = new int[lengthOfArray];
        int sum = 0;
        for (int i = 1; i < arrayOfNumber.length; i++) {
            sum = sum + arrayOfNumber[i];
        }
        averageOfArray = sum /= arrayOfNumber.length;
        return arrayOfNumber;
    }


}
