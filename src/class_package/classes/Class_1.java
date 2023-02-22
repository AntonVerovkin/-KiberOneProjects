package class_package.classes;

import java.util.Scanner;

public class Class_1 {
    public static void main(String[] args) {
        //System.out.println("1\n2\n3");


/*     //   for (int i = 5; i >= 1; i--) {
        //System.out.println(i);
        //    System.out.print(i + " ");
        //}
        for (int i = 1; i <= 10; i++) {
            //System.out.println(i);
            int m = i * 3;
            System.out.println("3 * " + i + " = " + m);
        }

        for (int i = 2; i <= 20; i += 2){
            System.out.print(i + " ");
        }*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int resultFactorial = 1;
        int userNumber = scanner.nextInt();
        for (int i = 1; i <= userNumber; i++) {
            resultFactorial *= i;
        }
        System.out.println("6! = " + resultFactorial);
    }
}

