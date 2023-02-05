package class_package.class_10;

public class Student extends  Person{
    private  int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student(String name, String surname, int age, int height, int grade){
        super(name, surname, age, height);
        this.grade = grade;

    }
}
