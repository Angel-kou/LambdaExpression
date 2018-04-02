import java.util.List;
import java.util.Optional;

public class BookPicker {
    public static final String BOOK_NOT_EXIST = "Not exist";
    public String findBookByAuthorName(List<Book> bookList, String author) {
        Optional<Book> firstMatchedBook = bookList.stream()
                .filter((book) -> author.equals(book.getAuthor()))
                .findFirst();
        return firstMatchedBook.isPresent() ? firstMatchedBook.get().showBookInfo() : BOOK_NOT_EXIST;
    }
}
