import model.Book;
import service.BookService;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService();
        Book book1 = new Book(0, "El Quijote", "Miguel de Cervantes", 500.0, 10);
        Book book2 = new Book(1, "Cien Años de Soledad", "Gabriel García Márquez", 700.0, 5);
        bookService.showBook(book1);
        bookService.showBook(book2);
        bookService.sellCopies(book1, 3);
        bookService.showBook(book1);
        bookService.sellCopies(book2, 8);
        bookService.showBook(book2);
        bookService.addCopies(book2, 5);
        bookService.showBook(book2);


    }
}