package bookShelfTest;

import bookShelf.BookCategory;
import bookShelf.BookShelf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookShelfTest {
    @Test
    public void testBookShelfCanAddBooks() {
        BookShelf myBooks = new BookShelf();
        myBooks.addBooks("ditel","michi", BookCategory.EDUCATIONAL);
        assertEquals(1, myBooks.countBooks());
    }
    @Test
    public void testBookShelfCanAddAnotherBook() {
        BookShelf myBooks = new BookShelf();
        myBooks.addBooks("ditel","michi", BookCategory.EDUCATIONAL);
        myBooks.addBooks("go", "goddd", BookCategory.SCI_FI);
        assertEquals(2, myBooks.countBooks());
    }
    @Test
    public void testBookShelfCanRemoveBooksByTitle() {
        BookShelf myBooks = new BookShelf();
        myBooks.addBooks("ditel","michi", BookCategory.EDUCATIONAL);
        myBooks.addBooks("go", "goddd", BookCategory.SCI_FI);
        myBooks.remove("ditel");
        assertEquals(1, myBooks.countBooks());
    }
    @Test
    public void testBookShelfCanSerchBookByTitle(){
        BookShelf myBooks = new BookShelf();
        myBooks.addBooks("ditel","michi", BookCategory.EDUCATIONAL);
        myBooks.addBooks("go", "goddd", BookCategory.SCI_FI);
        myBooks.addBooks("goddd", "green", BookCategory.INSPIRATIONAL);
        myBooks.addBooks("goddd", "red", BookCategory.ROMANTIC);
        int result = myBooks.search("ditel");
        assertEquals(1, result);
    }
    @Test
    public void testBookShelfCanSerch2BooksByTitle(){
        BookShelf myBooks = new BookShelf();
        myBooks.addBooks("ditel","michi", BookCategory.EDUCATIONAL);
        myBooks.addBooks("go", "goddd", BookCategory.SCI_FI);
        myBooks.addBooks("goddd", "green", BookCategory.INSPIRATIONAL);
        myBooks.addBooks("goddd", "red", BookCategory.ROMANTIC);
        int result = myBooks.search("goddd");
        assertEquals(2, result);
    }
    @Test
    public void testBookShelfCanSerchBooksByAuthor(){
        BookShelf myBooks = new BookShelf();
        myBooks.addBooks("ditel","michi", BookCategory.EDUCATIONAL);
        myBooks.addBooks("go", "goddd", BookCategory.SCI_FI);
        myBooks.addBooks("goddd", "green", BookCategory.INSPIRATIONAL);
        myBooks.addBooks("goddd", "red", BookCategory.ROMANTIC);
        int result = myBooks.search("michi");
        assertEquals(1, result);
    }
    @Test
    public void testBookShelfCanSerch2BooksByAuthorAndTitle(){
        BookShelf myBooks = new BookShelf();
        myBooks.addBooks("ditel","michi", BookCategory.EDUCATIONAL);
        myBooks.addBooks("go", "goddd", BookCategory.SCI_FI);
        myBooks.addBooks("goddd", "green", BookCategory.INSPIRATIONAL);
        myBooks.addBooks("goddd", "red", BookCategory.ROMANTIC);
        myBooks.addBooks("goddd", "red", BookCategory.ROMANTIC);
        int result = myBooks.search("michi");
        assertEquals(2, result);
    }
    @Test
    public void testBookShelfCanSerchBooksByCharacter(){
        BookShelf myBooks = new BookShelf();
        myBooks.addBooks("ditel","michi", BookCategory.EDUCATIONAL);
        myBooks.addBooks("go", "goddd", BookCategory.SCI_FI);
        myBooks.addBooks("goddd", "green", BookCategory.INSPIRATIONAL);
        myBooks.addBooks("goddd", "red", BookCategory.ROMANTIC);
        int result = myBooks.search("g");
        assertEquals(3, result);
    }
    @Test
    public void testTBooksWereCatagorised(){
        BookShelf myBooks = new BookShelf();
        myBooks.addBooks("ditel","michi", BookCategory.EDUCATIONAL);
        myBooks.addBooks("go", "goddd", BookCategory.SCI_FI);
        myBooks.addBooks("goddd", "green", BookCategory.INSPIRATIONAL);
        myBooks.addBooks("goddd", "red", BookCategory.ROMANTIC);
        myBooks.addBooks("hot", "red", BookCategory.ROMANTIC);
        int result = myBooks.search(BookCategory.ROMANTIC);
    }
}
