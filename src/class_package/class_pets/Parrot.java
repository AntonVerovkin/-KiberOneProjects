package class_package.class_pets;

import java.time.Year;
import java.util.Objects;

public class Parrot extends pet{
    private String colorOfFeather;
    private String colorOfPaws;

    private String colorOfBreak;

    private int yearOfBirth;

    public Parrot(int amountOfLimbs, int height, String eyeColor, String colorOfFeather, String colorOfPaws, String colorOfBreak, int yearOfBirth) {
        super(amountOfLimbs, height, eyeColor);
        this.colorOfFeather = colorOfFeather;
        this.colorOfPaws = colorOfPaws;
        this.colorOfBreak = colorOfBreak;
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getColorOfFeather() {
        return colorOfFeather;
    }

    public void setColorOfFeather(String colorOfFeather) {
        this.colorOfFeather = colorOfFeather;
    }

    public String getColorOfPaws() {
        return colorOfPaws;
    }

    public void setColorOfPaws(String colorOfPaws) {
        this.colorOfPaws = colorOfPaws;
    }

    public String getColorOfBreak() {
        return colorOfBreak;
    }

    public void setColorOfBreak(String colorOfBreak) {
        this.colorOfBreak = colorOfBreak;
    }

    @Override
    public String lifetime() {
        return super.lifetime() + "9 лет.";
    }

    public int getAge() {
       int currentYear = Year.now().getValue();
        return currentYear - yearOfBirth;
    }
    public void printAge() {
        System.out.println("Возраст Вашего питомца " + getAge() + " лет");

    }

}
