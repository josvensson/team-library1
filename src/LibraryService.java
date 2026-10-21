import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void listBooks() {
        int index = 1;
        for (Book book : books)
            System.out.printf("[%d] - %s - %s - %s\n",
                    index++,
                    book.getTitle(),
                    book.getAuthor(),
                    book.isAvailibilty() ? "Available" : "Borrowed");
    }

    public void borrowBook(Book book) {
        book.setAvailibilty(false);
    }

    public void returnBook(Book book) {
        book.setAvailibilty(true);
    }
}
