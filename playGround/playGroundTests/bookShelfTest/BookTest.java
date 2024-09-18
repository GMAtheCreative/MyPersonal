package bookShelfTest;

import bookShelf.BookCategory;
import bookShelf.MyBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
    @Test
    public void testBookHasTitle() {
        MyBook myBook = new MyBook("Ditel", "ditel", BookCategory.EDUCATIONAL);
        assertEquals("Ditel", myBook.getTitle());
    }
    @Test
    public void testBookHasAuthor() {
        MyBook myBook = new MyBook("Ditel", "ditel", BookCategory.EDUCATIONAL);
        assertEquals("ditel", myBook.getauthor());
    }

}
