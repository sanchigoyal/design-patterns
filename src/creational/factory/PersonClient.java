package creational.factory;

/**
 * This is client code, which uses the factory to obtain instances of student and teacher.
 */
public class PersonClient {

  public static void main(String[] args) {
    Person student = PersonFactory.getPerson(PersonType.STUDENT);
    System.out.println(student);
    Person teacher = PersonFactory.getPerson(PersonType.TEACHER);
    System.out.println(teacher);
  }

}
