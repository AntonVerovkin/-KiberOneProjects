package class_package.class_pisec;

public class Pisces implements Eatable{
    private String name;
    private boolean isPredator;
    private String family;
    private String eat;

    public Pisces(String name, boolean isPredator, String family, String eat) {
        this.name = name;
        this.isPredator = isPredator;
        this.family = family;
        this.eat = eat;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String eat(String eat) {
        return "Эта рыба ест " + this.eat;
    }
}
