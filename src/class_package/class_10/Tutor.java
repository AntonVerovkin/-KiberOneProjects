package class_package.class_10;

public class Tutor extends Person{
    private int numberOfClassesHeTeachesTerWeek;

    public Tutor(String name, String surname, int age, int height, int numberOfClassesHeTeachesTerWeek) {
        super(name, surname, age, height);
        this.numberOfClassesHeTeachesTerWeek = numberOfClassesHeTeachesTerWeek;
    }

    public int getNumberOfClassesHeTeachesTerWeek() {
        return numberOfClassesHeTeachesTerWeek;
    }

    public void setNumberOfClassesHeTeachesTerWeek(int numberOfClassesHeTeachesTerWeek) {
        this.numberOfClassesHeTeachesTerWeek = numberOfClassesHeTeachesTerWeek;
    }
}
