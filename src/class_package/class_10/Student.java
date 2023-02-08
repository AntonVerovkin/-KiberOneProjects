package class_package.class_10;

public class Student extends  Person implements Callable{
    private  int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }



    public Student(String name, String surname, int age, int height, String phoneNumber, int grade) {
        super(name, surname, age, height, phoneNumber);
        this.grade = grade;
    }
    public String call() {
        return "позвонить студенту \" + getName() + \" можно позвонить по номеру \" + getPhoneNumber()" ;
    }
    public String call(Person person) {
        if (this.getPhoneNumber().equals(person.getPhoneNumber())){
            return "Рувозможно позвонить самому себе";
        } else {
            return "Студент" + this.getName()
                    + " " + this.getSurname()
                    + " звонит "
                    + person.getName()
                    + " " + person.getSurname();
        }
    }
    @Override
    public String print() {
        return super.print() + "\nКласс: " + grade;
    }
}
