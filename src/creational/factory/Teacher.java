package creational.factory;

/**
 * This class is a sub-class of Person with values of Teacher hard coded.
 */
public class Teacher extends Person {

  @Override
  public String getFirstName() {
    return "Joe";
  }

  @Override
  public String getLastName() {
    return "Brown";
  }

  @Override
  public int getAge() {
    return 40;
  }

  @Override
  public PersonType getType() {
    return PersonType.TEACHER;
  }
}
