package repository;

import dataobject.User;
import exception.BookAlreadyExistsException;
import exception.UserAlreadyExistsException;
import java.util.HashMap;
import java.util.Map;

public class UserManager {

  private final Map<Integer, User> users;

  public UserManager() {
    this.users = new HashMap<>();
  }

  public void addUser(User user) throws UserAlreadyExistsException {
    if (!users.containsKey(user.getId())) {
      users.put(user.getId(), user);
    } else {
      throw new UserAlreadyExistsException("User with id %s already exists", user.getId());
    }
  }

}
