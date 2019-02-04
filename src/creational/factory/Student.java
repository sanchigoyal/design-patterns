package creational.factory;

/**
 * This class is a sub-class of Person with values of Student hard coded.
 */
public class Student extends Person {

  @Override
  public String getFirstName() {
    return "Sanchi";
  }

  @Override
  public String getLastName() {
    return "Goyal";
  }

  @Override
  public int getAge() {
    return 18;
  }

  @Override
  public PersonType getType() {
    return PersonType.STUDENT;
  }


}
