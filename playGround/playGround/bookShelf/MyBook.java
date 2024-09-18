package bookShelf;

public class MyBook {
    private String title;
    private String author;
    private BookCategory category;

    public MyBook(String title, String author, BookCategory category) {
        this.title = title;
        this.author = author;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getauthor() {
        return author;
    }
}
