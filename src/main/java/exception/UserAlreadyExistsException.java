package exception;

public class UserAlreadyExistsException extends Exception {

  public UserAlreadyExistsException(String messageTemplate, int userId) {
    super(String.format(messageTemplate, userId));
  }

}
