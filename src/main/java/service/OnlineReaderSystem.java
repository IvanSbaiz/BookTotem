package service;

import dataobject.Book;
import dataobject.User;
import lombok.Getter;
import lombok.Setter;
import repository.Library;
import repository.UserManager;

@Getter
public class OnlineReaderSystem {

  private final Library library;
  private final UserManager userManager;
  private final Display display;
  private User activeUser;
  private Book activeBook;

  public OnlineReaderSystem(Library library, UserManager userManager, Display display) {
    this.library = library;
    this.userManager = userManager;
    this.display = display;
  }

  public void setActiveBook(Book book) {
    this.activeBook = book;
    display.setBook(book);
  }

  public void setActiveUser(User user) {
    this.activeUser = user;
    display.setUser(user);
  }
}
