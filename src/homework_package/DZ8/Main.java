package homework_package.DZ8;

import class_package.class_10.Person;
import class_package.class_10.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, its my new program");
        Phone firstPhone = new Phone("Samsung Galaxy 32A ", 32, 12, true);

        System.out.println(firstPhone.getDisplay());
        firstPhone.setSizeRAM(11);
        System.out.println(firstPhone.getSizeRAM());

        Android secondPhone = new Android("Samsung Galaxy 32A Hyper Ultra Super Pro Mega Max", 32, 12, true, 6);

        System.out.println(secondPhone.getModel());
    }
}