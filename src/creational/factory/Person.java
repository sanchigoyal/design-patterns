package creational.factory;

/**
 * This class is an abstract class.
 */
public abstract class Person {

  public abstract String getFirstName();

  public abstract String getLastName();

  public abstract int getAge();

  public abstract PersonType getType();

  @Override
  public String toString() {
    return "[firstName=" + this.getFirstName() +
        ", lastName=" + this.getLastName() +
        ", age=" + this.getAge() +
        ", type=" + this.getType() +
        "]";
  }
}
