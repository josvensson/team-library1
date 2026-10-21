public class Book {
    private String title;
    private String author;
    private boolean availibilty;

    public Book (String title, String author, boolean availibilty){
        this.title = title;
        this.author = author;
        this.availibilty = availibilty;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailibilty() {
        return availibilty;
    }

    public void setAvailibilty(boolean availibilty) {
        this.availibilty = availibilty;
    }
}
