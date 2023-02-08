package class_package.class_10;

public class Tutor extends Person implements Callable{
    private int numberOfClassesHeTeachesTerWeek;



    public Tutor(String name, String surname, int age, int height, String phoneNumber, int numberOfClassesHeTeachesTerWeek) {
        super(name, surname, age, height, phoneNumber);
        this.numberOfClassesHeTeachesTerWeek = numberOfClassesHeTeachesTerWeek;
    }

    public int getNumberOfClassesHeTeachesTerWeek() {
        return numberOfClassesHeTeachesTerWeek;
    }

    public void setNumberOfClassesHeTeachesTerWeek(int numberOfClassesHeTeachesTerWeek) {
        this.numberOfClassesHeTeachesTerWeek = numberOfClassesHeTeachesTerWeek;
    }

    @Override
    public String call() {
        return "позвонить тьютору " + getName() + " можно позвонить по номеру " + getPhoneNumber() ;

    }
    public String call(Tutor anotherTutor){
        if (this.getPhoneNumber().equals(anotherTutor.getPhoneNumber())){
            return "Рувозможно позвонить самому себе";
        } else {
            return "Тьютор" + this.getName()
                    + " " + this.getSurname()
                    + " звонит тьютору "
                    + anotherTutor.getName()
                    + " " + anotherTutor.getSurname();
        }
    }

    @Override
    public String print() {
        return super.print() + "\nКласс: " + numberOfClassesHeTeachesTerWeek;
    }
}
