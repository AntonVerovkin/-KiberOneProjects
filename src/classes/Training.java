package classes;

import java.util.Scanner;

public class Training {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the Celsius: ");
//        int userCelsius = scanner.nextInt();
//        System.out.println(userCelsius +" "+ "C"+ " " + "="+ " "+ converterFromCelsiusToFahranheit(userCelsius)+ " " + "F");
//
//        System.out.println(userCelsius +" "+ "C"+ " " + "="+ " "+ converterFromCelsiusToKelvin(userCelsius)+ " " + "K");
        System.out.println("Enter the first number: ");
        int userNum1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int userNum2 = scanner.nextInt();
        System.out.println(
                "Число" + " " + compareMagnitudeOfNumbers(userNum1, userNum2)
                        + " " + "оказалось"
                        + " " + "больше.");
    }

    public static int converterFromCelsiusToFahranheit(int celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double converterFromCelsiusToKelvin(int celsius) {
        return celsius + 273;
    }

    public static int compareMagnitudeOfNumbers(int num1, int num2) {
        /*if (Math.abs(num1) > Math.abs(num2)){
            return num1;
        }else {
            return num2;
        }*/

        return Math.abs(num1) > Math.abs(num2) ? num1 : num2;


    }
}
