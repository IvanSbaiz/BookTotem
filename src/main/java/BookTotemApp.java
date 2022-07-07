import dataobject.Book;
import dataobject.User;
import exception.BookAlreadyExistsException;
import exception.BookNotExistsException;
import exception.UserAlreadyExistsException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAmount;
import repository.Library;
import repository.UserManager;
import service.Display;
import service.OnlineReaderSystem;

public class BookTotemApp {

  public static void main(String[] args)
      throws BookAlreadyExistsException, UserAlreadyExistsException, BookNotExistsException {
    Library library = new Library();
    UserManager userManager = new UserManager();
    Display display = new Display();
    OnlineReaderSystem onlineReaderSystem = new OnlineReaderSystem(library, userManager, display);

    Book dsBook = new Book(1, "It contains Data Structures", "Ds");
    Book algoBook = new Book(2, "It contains Algorithms", "Algo");

    onlineReaderSystem.getLibrary().addBook(dsBook);
    onlineReaderSystem.getLibrary().addBookPage(dsBook.getId(), "pagina 1");
    onlineReaderSystem.getLibrary().addBookPage(dsBook.getId(), "pagina 2");
    onlineReaderSystem.getLibrary().addBookPage(dsBook.getId(), "pagina 3");
    onlineReaderSystem.getLibrary().addBook(algoBook);
    onlineReaderSystem.getLibrary().addBookPage(algoBook.getId(), "pagina 1 - algobook");

    User user1 = new User(1, "pippo", "Ram");
    User user2 = new User(2, "pluto", "Gopal");

    onlineReaderSystem.getUserManager().addUser(user1);
    onlineReaderSystem.getUserManager().addUser(user2);

    onlineReaderSystem.setActiveBook(dsBook);
    onlineReaderSystem.setActiveUser(user1);

    onlineReaderSystem.getDisplay().turnPageForward();
    onlineReaderSystem.getDisplay().turnPageForward();
    onlineReaderSystem.getDisplay().turnPageBackward();
  }

}
