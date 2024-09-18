package bookShelf;

import java.util.ArrayList;

public class BookShelf {
    private MyBook books;
    private ArrayList<MyBook> myBooks = new ArrayList<>();

    public int countBooks() {
        return myBooks.size();
    }

    public void addBooks(String title, String author, BookCategory category) {
        books = new MyBook(title, author, category);
        myBooks.add(books);
    }

    public void remove(String titel) {
        for(MyBook book : myBooks) {
            if(book.getTitle().equals(titel)) {
                myBooks.remove(book);
            }
        }

    }

    public short search(String title_author_category) {
        short bookCount = 0;
        for(MyBook book : myBooks) {
            if (book.getTitle().equals(title_author_category)){
                bookCount += 1;
            }
            if (book.getauthor().equals(title_author_category)) {
                bookCount += 1;
            }
            if(book.getauthor().contains(title_author_category) || book.getTitle().contains(title_author_category)) {
                bookCount += 1;
            }
        }
        return bookCount;
    }


}
