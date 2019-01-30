package creational.singleton;

/**
 * This is an example of singleton class using double checked locking initialization.
 */
public class DoubleCheckedLockingExample {

  private static volatile DoubleCheckedLockingExample instance;

  private DoubleCheckedLockingExample() {

  }

  /**
   * Returns the only instance of the class created during initialization.
   */
  public static DoubleCheckedLockingExample getInstance() {

    if (instance == null) {
      synchronized (DoubleCheckedLockingExample.class) {
        if (instance == null) {
          instance = new DoubleCheckedLockingExample();
        }
      }
    }

    return instance;
  }

}
