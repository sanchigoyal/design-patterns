package creational.singleton;

/**
 * This class is used to test the singleton class EagerInitializationExample.
 */
public class EagerInitializationExampleTest {

  public static void main(String args[]) {
    System.out.println("Start of main");

    EagerInitializationExample instance1 = EagerInitializationExample.getInstance();
    EagerInitializationExample instance2 = EagerInitializationExample.getInstance();

    System.out.println("Instance 1 = " + instance1 + ", Instance 2 = " + instance2);

    System.out.println("End of main");
  }

}
