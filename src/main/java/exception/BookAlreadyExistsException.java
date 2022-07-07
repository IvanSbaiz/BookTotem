package exception;

public class BookAlreadyExistsException extends Exception {

  public BookAlreadyExistsException(String messageTemplate, int bookId) {
    super(String.format(messageTemplate, bookId));
  }

}
