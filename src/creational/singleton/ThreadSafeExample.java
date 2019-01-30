package creational.singleton;

/**
 * This is an example of singleton class using thread safe initialization.
 */
public class ThreadSafeExample {

  private static volatile ThreadSafeExample instance;

  private ThreadSafeExample() {

  }

  /**
   * Returns the only instance of the class created during initialization.
   */
  public static synchronized ThreadSafeExample getInstance() {
    if (instance == null) {
      instance = new ThreadSafeExample();
    }

    return instance;
  }

}
