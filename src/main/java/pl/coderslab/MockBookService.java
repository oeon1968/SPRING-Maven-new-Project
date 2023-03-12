package pl.coderslab;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MockBookService implements BookService{
    private List<Book> list = new ArrayList<>();

    public MockBookService() {
        list.add(new Book(1L, "9788324631766", "Thiniking	in	Java", "Bruce	Eckel", "Helion", "programming"));
        list.add(new Book(2L, "9788324627738", "Rusz	glowa	Java.", "Sierra	Kathy,	Bates	Bert", "Helion",
                "programming"));
        list.add(new Book(3L, "9780130819338", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion",
                "programming"));
        }

    @Override
    public List<Book> getBooks() {
        return list;
    }

    @Override
    public int removeBook(long id) {

        List<Book> myList = getBooks();
        for (Book book : myList) {
            if (book.getId() == id) {
                myList.remove(book);
                return 1;
            }
        }
        return 0;
    }

    @Override
    public Book getBook(long id) {

        List<Book> myList = getBooks();
        for (Book book : myList) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    @Override
    public void addBook(Book newBook) {
        long max = list.stream().max(
                (Book book1, Book book2) -> Long.compare(book1.getId(), book2.getId())).get().getId()+1;
        newBook.setId(max);
        list.add(newBook);
    }

    @Override
    public void updateBook(long id, Book modifiedBook) {
        List<Book> myList = getBooks();
        for (Book book : myList) {
            if (book.getId() == id) {
                book.setIsbn(modifiedBook.getIsbn());
                book.setAuthor(modifiedBook.getAuthor());
                book.setPublisher(modifiedBook.getPublisher());
                book.setTitle(modifiedBook.getTitle());
                book.setType(modifiedBook.getType());
                return;
            }
        }

    }
}
