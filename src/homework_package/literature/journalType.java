package homework_package.literature;

public class journalType {
    private int timeOfPrint;
    private String name;
    private String type;
    private String themes;

    public journalType(int timeOfPrint, String name, String type, String themes) {
        this.timeOfPrint = timeOfPrint;
        this.name = name;
        this.type = type;
        this.themes = themes;
    }

    public int getTimeOfPrint() {
        return timeOfPrint;
    }

    public void setTimeOfPrint(int timeOfPrint) {
        this.timeOfPrint = timeOfPrint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getThemes() {
        return themes;
    }

    public void setThemes(String themes) {
        this.themes = themes;
    }
}
