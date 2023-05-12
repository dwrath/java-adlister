package models;

public class Author {
    private int id = 0;

    public Author() {
    }

    public Author(String name) {
        this.id++;
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
