package creational.singleton;

/**
 * This class is used to test the singleton class LazyInitializationExample.
 */
public class LazyInitializationExampleTest {

  public static void main(String args[]) {
    System.out.println("Start of main");

    LazyInitializationExample instance1 = LazyInitializationExample.getInstance();
    LazyInitializationExample instance2 = LazyInitializationExample.getInstance();

    System.out.println("Instance 1 = " + instance1 + ", Instance 2 = " + instance2);

    System.out.println("End of main");
  }

}
