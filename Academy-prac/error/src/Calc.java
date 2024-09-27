public class Calc {
  //only one instance
  private static Calc current;

  /**
   * getter
   * @return
   */
  public static Calc getInstance() {
    if (current == null) {
      current = new Calc();
    }
    return current;
  }

  //parent's constructer
  private Calc() {
    super();
  }

  /**
   * division, error handled in the method
   * @param x
   * @param y
   * @return  x/y
   */
  public int div(int x, int y) {
    int z = 0;
    try {
      z = x /y;
    } catch (Exception e) {
      System.out.println("cannot be divided by 0");
    }
    return z;
  }

  /**
   * division with throws Exception, error handled in main class
   * @param x
   * @param y
   * @return
   * @throws Exception
   */
  public int divEx(int x, int y) throws Exception {
    return x / y;
  }
}
