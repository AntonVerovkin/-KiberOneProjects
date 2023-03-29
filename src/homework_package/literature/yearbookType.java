package homework_package.literature;

public class yearbookType {
    private String publishing;
    private int timeOfPrint;
    private String name;
    private String themes;

    private String type;

    public yearbookType(String publishing, int timeOfPrint, String name, String themes, String type) {
        this.publishing = publishing;
        this.timeOfPrint = timeOfPrint;
        this.name = name;
        this.themes = themes;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
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

    public String getThemes() {
        return themes;
    }

    public void setThemes(String themes) {
        this.themes = themes;
    }
}
