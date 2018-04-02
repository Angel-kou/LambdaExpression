import java.util.Optional;

public class Book {
    private String bookName;
    private String author;
    private String publishDate;
    private String description;

    public Book(String bookName, String author, String publishDate, String description) {
        this.bookName = bookName;
        this.author = author;
        this.publishDate = publishDate;
        this.description = description;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getDescription() {
        return description;
    }


    public String showBookInfo() {
        String desc = Optional.ofNullable(this.getDescription()).orElse("no description");
        return String.format("%s - %s - %s", this.getBookName().toUpperCase(), this.getAuthor(), desc);
    }

}
