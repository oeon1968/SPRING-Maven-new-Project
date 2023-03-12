package pl.coderslab;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BookService {
    List<Book> getBooks();

    int removeBook(long id);

    Book getBook(long id);

    void addBook(Book newBook);

    void updateBook(long id, Book modifiedBook);

}
