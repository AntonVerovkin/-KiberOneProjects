package class_package.class_10;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, its my new program");
        //Person firstPerson = new Person("Ivan", "Heta", 12);
        Person firstPerson = new Person("Ivan", "Heta",
                12, 122, "11111");

        System.out.println(firstPerson.getHeight());
        firstPerson.setAge(11);
        System.out.println(firstPerson.getAge());

        Person secondPerson = new Person("Ivan", "Heta",
                12, 122, "11111");

        Student firstStudent = new Student("Ivan", "Heta",
                12, 165, "11212", 6);
        System.out.println(firstStudent.getName());

        Tutor Tutor = new Tutor("Ivan", "Heta",
                38, 165, "12323434", 38);
        System.out.println("Тьотур" + +Tutor.getNumberOfClassesHeTeachesTerWeek());
        Tutor Tutor2 = new Tutor("Ivan2", "Heta",
                38, 165, "123234342", 38);
        System.out.println(Tutor.call(Tutor));

        System.out.println(firstStudent.call(Tutor2));
        System.out.println(firstPerson.print());

    }
}
