package creational.factory;

/**
 * This class implements factory pattern. Its a facade that clients can use to obtain instances of
 * type person.
 */
public class PersonFactory {

  /**
   * Returns the instance of Person based on the input type.
   */
  public static Person getPerson(PersonType type) {

    switch (type) {
      case STUDENT:
        return new Student();
      case TEACHER:
        return new Teacher();
      default:
        return null;
    }
  }

}
