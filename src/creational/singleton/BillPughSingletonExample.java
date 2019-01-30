package creational.singleton;

/**
 * This is an example of singleton class using Bill Pugh initialization.
 */
public class BillPughSingletonExample {

  private BillPughSingletonExample() {

  }

  private static class BillPughSingletonHolder {

    private static final BillPughSingletonExample INSTANCE = new BillPughSingletonExample();
  }

  /**
   * Returns the singleton instance of the class.
   */
  public static BillPughSingletonExample getInstance() {
    return BillPughSingletonHolder.INSTANCE;
  }

}
