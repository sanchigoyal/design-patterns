package creational.singleton;

/**
 * This is an example of singleton class using eager initialization.
 */
public class EagerInitializationExample {

  private static volatile EagerInitializationExample instance = new EagerInitializationExample();

  private EagerInitializationExample() {
    System.out.println("Constructor was called to create the instance");
  }

  /**
   * Returns the only instance of the class created during initialization.
   */
  public static EagerInitializationExample getInstance() {
    System.out.println("Requesting singleton instance");
    return instance;
  }

}
