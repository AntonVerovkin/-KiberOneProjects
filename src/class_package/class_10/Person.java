package class_package.class_10;

public class Person implements Ptintable{
    private String name;
    private String surname;
    private int age;
    private int height;
    private String phoneNumber;

    public Person(String name, String surname, int age, int height, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.phoneNumber = phoneNumber;
    }

    public Person(String name, int i, int age, boolean b) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    @Override
    public String print() {
        return String.format("Имя: %s;\nФамилия: %s;\nНомер телефона %s.", name, surname, phoneNumber);
    }


}
