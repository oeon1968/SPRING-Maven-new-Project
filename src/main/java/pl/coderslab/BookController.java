package pl.coderslab;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


//@RestController
@RequestMapping("/books")
public class BookController {
    private BookService bookService;

    //pusty konstruktor musi być zawsze!
    public BookController() {
    }

    // konstruktor właściwy wykorzysta odpowiedni obiekt zapisany w AppConfig => MockBookService (mpja "DB")
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    //SELECT all books
    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json; charset = UTF-8")
    public List<Book> getList() {

        return bookService.getBooks();
    }
    //DELETE one book
    @ResponseBody
    @DeleteMapping(value = "/{id}")
    public int deleteBook(@PathVariable("id") long id){

        return bookService.removeBook(id);
    }
    //SELECT one book
    @GetMapping(value = "/{id}", produces = "text/html; charset = UTF-8")
    public String getBook(Model model, @PathVariable("id") long id) {
        Book book = bookService.getBook(id);
        model.addAttribute("book", book);

        return "showBook";
    }
    //INSERT
    @PostMapping(value = "/", produces = "text/html; charset = UTF-8")
    public String addBook (@RequestBody Book book){
        bookService.addBook(book);
        return "showBook";
    }
    //UPDATE
    @PutMapping(value = "/{id}")
    public String updateBook(@PathVariable("id") long id, @RequestBody Book book) {
        bookService.updateBook(id, book);
        return "showBook";
    }

}


