package creational.singleton;

/**
 * This class is used to test the singleton class StaticBlockExample.
 */
public class StaticBlockExampleTest {

  public static void main(String args[]) {
    System.out.println("Start of main");

    StaticBlockExample instance1 = StaticBlockExample.getInstance();
    StaticBlockExample instance2 = StaticBlockExample.getInstance();

    System.out.println("Instance 1 = " + instance1 + ", Instance 2 = " + instance2);

    System.out.println("End of main");
  }

}
