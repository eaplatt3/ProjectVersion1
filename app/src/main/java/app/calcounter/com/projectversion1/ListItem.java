package app.calcounter.com.projectversion1;

public class ListItem {
    private String name;
    private String description;
    private int priority;

    public ListItem(String name, String description, int priority){
        this.name = name;
        this.description = description;
        this.priority = priority;

    }

    public int getPriority() {return  priority;}

    public void setPriority(int priority) {this.priority =  priority;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
