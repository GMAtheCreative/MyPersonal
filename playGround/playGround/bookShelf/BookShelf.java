package bookShelf;

import java.util.ArrayList;

public class BookShelf {
    private MyBook books;
    private ArrayList<MyBook> myBooks = new ArrayList<>();

    public int countBooks() {
        return myBooks.size();
    }

    public void addBooks(String title, String author) {
        books = new MyBook(title, author);
        myBooks.add(books);
    }

    public void remove(String titel) {
        for(MyBook book : myBooks) {
            if(book.getTitle().equals(titel)) {
                myBooks.remove(book);
            }
        }

    }

    public short search(String titleOrAuthor) {
        short bookCount = 0;
        for(MyBook book : myBooks) {
            if (book.getTitle().equals(titleOrAuthor)){
                bookCount += 1;
            }
            if (book.getauthor().equals(titleOrAuthor)) {
                bookCount += 1;
            }
        }
        return bookCount;
    }


}
