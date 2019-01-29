package creational.singleton;

/**
 * This is an example of singleton class using static block initialization.
 */
public class StaticBlockExample {

  private static StaticBlockExample instance;

  private StaticBlockExample() {
    System.out.println("Constructor was called to create the instance");
  }

  static {
    try {
      instance = new StaticBlockExample();
    } catch (Exception e) {
      // do something
      throw new RuntimeException();
    }
  }

  /**
   * Returns the only instance of the class created during initialization.
   */
  public static StaticBlockExample getInstance() {
    System.out.println("Requesting singleton instance");
    return instance;
  }

}
