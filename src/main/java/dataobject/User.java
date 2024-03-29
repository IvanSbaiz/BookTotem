package dataobject;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {

  private final int id;
  private final String name;
  private final String surname;

}
