package homework_package.literature;

public class typeBook {
    private String publishing;
    private int timeOfPrint;
    private String name;
    private String type;
    private String author;

    public typeBook(String publishing, int timeOfPrint, String name, String type, String author) {
        this.publishing = publishing;
        this.timeOfPrint = timeOfPrint;
        this.name = name;
        this.type = type;
        this.author = author;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTimeOfPrint() {
        return timeOfPrint;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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


}
