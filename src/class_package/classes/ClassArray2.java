package class_package.classes;

import java.util.Arrays;
import java.util.Random;

public class ClassArray2 {
    public static void main(String[] args) {
        int[] array = {
                1,
                2,
                3,
                4,
                5,
        };
//        array[0] = (int) Math.pow(array[0], 2);
//        array[1] = (int) Math.pow(array[1], 2);
//        array[2] = (int) Math.pow(array[2], 2);
//        array[3] = (int) Math.pow(array[3], 2);
//        array[4] = (int) Math.pow(array[4], 2);
//
//        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(array[i], 2);

        }
        System.out.println(Arrays.toString(array));

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0){
//                System.out.println(array[i]);
//            }
//
//        }
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);

        int[] myArray = createArrayWithRandomNumbers(10);
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(sortArrayToOddNumbers(myArray)));
    }

    public static int[] createArrayWithRandomNumbers(int lengthOfArray) {
        int[] arrayOfNumber = new int[lengthOfArray];

        for (int i = 0; i < arrayOfNumber.length; i++) {
            Random vbr = new Random();
            arrayOfNumber[i] = vbr.nextInt(vbr.nextInt(1000));
        }

        return arrayOfNumber;
    }

    public static int[] sortArrayToOddNumbers(int[] arrayOfNumbers) {
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] % 2 == 0) {
                arrayOfNumbers[i] = 0;
            }
        }
        return arrayOfNumbers;
    }


}

