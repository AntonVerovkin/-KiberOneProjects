package class_package.class_pets;

public class pet implements Lifeable{
    private int amountOfLimbs;
    private int height;
    private String eyeColor;

    public pet(int amountOfLimbs, int height, String eyeColor) {
        this.amountOfLimbs = amountOfLimbs;
        this.height = height;
        this.eyeColor = eyeColor;

    }

    public int getAmountOfLimbs() {
        return amountOfLimbs;
    }

    public void setAmountOfLimbs(int amountOfLimbs) {
        this.amountOfLimbs = amountOfLimbs;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public String lifetime() {
        return "Продолжительность жизни: ";
    }
}



// Создать структуру данных для хранения информации о книге (название, автор, издательство, год издания), о журнале (название, тематика, год и месяц выхода в печать), о ежегоднике (название, тематика, издательство, год издания). И иметь функционал вывода в консоль литературы (всю доступную информацию) с фильтрацией по определённому году (год вводит пользователь с консоли).

