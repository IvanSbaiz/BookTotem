package repository;

import dataobject.Book;
import exception.BookAlreadyExistsException;
import exception.BookNotExistsException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Library {

  private final Map<Integer, Book> books;

  public Library() {
    this.books = new HashMap<>();
  }

  public void addBook(Book book) throws BookAlreadyExistsException {
    if (!books.containsKey(book.getId())) {
      books.put(book.getId(), book);
    } else {
      throw new BookAlreadyExistsException("Book with id %s already exists", book.getId());
    }
  }

  public void addBookPage(int bookId, String page) throws BookNotExistsException {
    Optional<Book> optionalBook = Optional.ofNullable(books.get(bookId));
    if (optionalBook.isPresent()) {
       Book book = optionalBook.get();
       book.addPage(page);
    } else {
      throw new BookNotExistsException();
    }

  }

}
