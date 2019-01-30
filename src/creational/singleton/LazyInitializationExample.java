package creational.singleton;

/**
 * This is an example of singleton class using lazy initialization.
 */
public class LazyInitializationExample {

  private static volatile LazyInitializationExample instance;

  private LazyInitializationExample() {

  }

  /**
   * Returns the only instance of the class created if null.
   */
  public static LazyInitializationExample getInstance() {
    System.out.println("Requesting singleton instance");

    if (instance == null) {
      System.out.println("Instance created for use");
      instance = new LazyInitializationExample();
    }

    return instance;
  }

}
