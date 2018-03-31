import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BookPickerTest {

    @Test
    public void shouldPickUpOneUsefulBookWhenBookExists() {
        Book happyBook =
                new Book("Happy Story", "Tom Hanks", "2017-05-05", "happy");
        Book sadBook =
                new Book("Sad Story", "Tom Cruz", "2013-05-05", "sad");
        Book interestingBook =
                new Book("Interesting Story", "Steven Hanks", "2009-05-05", "interesting");
        Book boringBook =
                new Book("Boring Story", "Joshua B.H.", "2011-05-05", "boring");
        Book horribleBook =
                new Book("Horrible Story", "Tom Cruz", "2011-08-31", "horrible");
        List<Book> books = Arrays.asList(happyBook, sadBook, interestingBook, boringBook, horribleBook);
        BookPicker bookPicker = new BookPicker();

        String bookInfo = bookPicker.findBookByAuthorName(books,"Tom Cruz");

        assertThat(bookInfo, is("SAD STORY - Tom Cruz - sad"));
    }

    @Test
    public void shouldPickUpOneUsefulBookWhenBookExistsButDescIsNull() {
        Book happyBook =
                new Book("Happy Story", "Tom Hanks", "2017-05-05", null);
        Book sadBook =
                new Book("Sad Story", "Tom Cruz", "2013-05-05", null);
        Book interestingBook =
                new Book("Interesting Story", "Steven Hanks", "2009-05-05", "interesting");
        Book boringBook =
                new Book("Boring Story", "Joshua B.H.", "2011-05-05", null);
        Book horribleBook =
                new Book("Horrible Story", "Tom Cruz", "2011-08-31", "horrible");
        List<Book> books = Arrays.asList(happyBook, sadBook, interestingBook, boringBook, horribleBook);
        BookPicker bookPicker = new BookPicker();

        String bookInfo = bookPicker.findBookByAuthorName(books,"Tom Cruz");

        assertThat(bookInfo, is("SAD STORY - Tom Cruz - no description"));
    }

    @Test
    public void shouldNotPickUpAnyBookWhenBookNotExists() {
        Book happyBook =
                new Book("Happy Story", "Tom Hanks", "2013-05-05", "little happy");
        Book sadBook =
                new Book("Sad Story", "Tom B. Cruz", "2013-07-05", null);
        Book interestingBook =
                new Book("Interesting Story", "Steven Hanks", "2009-05-05", "interesting");
        Book boringBook =
                new Book("Boring Story", "Joshua B.H.", "2011-05-05", null);
        Book horribleBook =
                new Book("Horrible Story", "Tom Cruz", "2011-08-31", "horrible");
        List<Book> books = Arrays.asList(happyBook, sadBook, interestingBook, boringBook, horribleBook);
        BookPicker bookPicker = new BookPicker();

        String bookInfo = bookPicker.findBookByAuthorName(books,"Most awesome author without name");

        assertThat(bookInfo, is("Not exist"));
    }
}