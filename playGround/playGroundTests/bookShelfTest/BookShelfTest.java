package bookShelfTest;

import bookShelf.BookShelf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookShelfTest {
    @Test
    public void testBookShelfCanAddBooks() {
        BookShelf myBooks = new BookShelf();
        myBooks.addBooks("ditel","dditel");
        assertEquals(1, myBooks.countBooks());
    }
    @Test
    public void testBookShelfCanAddAnotherBook() {
        BookShelf myBooks = new BookShelf();
        myBooks.addBooks("ditel","ditel");
        myBooks.addBooks("youth alive","dditel");
        assertEquals(2, myBooks.countBooks());
    }
    @Test
    public void testBookShelfCanRemoveBooksByTitle() {
        BookShelf myBooks = new BookShelf();
        myBooks.addBooks("ditel","ditel");
        myBooks.addBooks("youth alive","dditel");
        myBooks.remove("ditel");
        assertEquals(1, myBooks.countBooks());
    }
    @Test
    public void testBookShelfCanSerchBookByTitle(){
        BookShelf myBooks = new BookShelf();
        myBooks.addBooks("ditel","michi");
        myBooks.addBooks("go", "save");
        myBooks.addBooks("goddd", "green");
        int result = myBooks.search("ditel");
        assertEquals(1, result);
    }
    @Test
    public void testBookShelfCanSerch2BooksByTitle(){
        BookShelf myBooks = new BookShelf();
        myBooks.addBooks("ditel","michi");
        myBooks.addBooks("go", "save");
        myBooks.addBooks("goddd", "green");
        myBooks.addBooks("goddd", "red");
        int result = myBooks.search("goddd");
        assertEquals(2, result);
    }
    @Test
    public void testBookShelfCanSerchBooksByAuthor(){
        BookShelf myBooks = new BookShelf();
        myBooks.addBooks("ditel","michi");
        myBooks.addBooks("go", "save");
        myBooks.addBooks("goddd", "green");
        myBooks.addBooks("goddd", "red");
        int result = myBooks.search("michi");
        assertEquals(1, result);
    }
    @Test
    public void testBookShelfCanSerch2BooksByAuthorAndTitle(){
        BookShelf myBooks = new BookShelf();
        myBooks.addBooks("ditel","michi");
        myBooks.addBooks("go", "goddd");
        myBooks.addBooks("goddd", "green");
        myBooks.addBooks("goddd", "red");
        myBooks.addBooks("goddd", "red");
        int result = myBooks.search("michi");
        assertEquals(2, result);
    }
}
