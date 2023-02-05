package class_package.class_10;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, its my new program");
        //Person firstPerson = new Person("Ivan", "Heta", 12);
        Person firstPerson = new Person("Ivan", "Heta", 12, 122);

        System.out.println(firstPerson.getHeight());
        firstPerson.setAge(11);
        System.out.println(firstPerson.getAge());

        Person secondPerson = new Person("Ivan", "Heta", 12, 122);

        Student firstStudent = new Student("Ivan", "Heta", 12, 165, 6);
        System.out.println(firstStudent.getName());

        Tutor firstTutor = new Tutor("Ivan", "Heta", 38, 165, 38);
        System.out.println("Тьотур" +  +  firstTutor.getNumberOfClassesHeTeachesTerWeek());
    }
}
