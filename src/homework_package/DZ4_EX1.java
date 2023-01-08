package homework_package;

import java.util.Arrays;
import java.util.Random;

public class DZ4_EX1 {

    public static void main(String[] args) {
        int[] myArray = createArrayWithRandomNumber(10);
        System.out.println(Arrays.toString(myArray));




    }

    private static int[] sortArrayToOddNumbers2(int[] arrayOfNumbers, int[] arrayNumbersOf5) {
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] % 5 == 0) {
                arrayNumbersOf5 = new int[]{
                        arrayOfNumbers[i],
                };

            }
        }
        return arrayNumbersOf5;

    }

    public static int[] createArrayWithRandomNumber(int lengthOfArray) {
        int[] arrayOfNumber = new int[lengthOfArray];

        for (int i = 0; i < arrayOfNumber.length; i++) {
            Random vbr = new Random();
            arrayOfNumber[i] = vbr.nextInt(10);
        }

        return arrayOfNumber;
    }



}