package homeworkClassesAndMethods;

public class Book {
    private int id;
    private String name;
    private String author;
    private int pageCount;
    private String description;

    public String toString(){
       return String.format("%d, %s, %s, %d, %s", this.getId(), this.getName(), this.getAuthor(), this.getPageCount(), this.getDescription());

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
