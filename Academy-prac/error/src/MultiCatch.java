public class MultiCatch {
  public static void main(String[] args) {
    int[] data = {100, 200, 300};
    try {
      for (int i=02; i>=-1; i--) {
        int k = i != 0 ? data[i]/i : i;
        System.out.println(k);
      }
    } catch (ArrayIndexOutOfBoundsException e1) {
      System.out.println("index exceeded");
      System.out.println(e1.getMessage());
    } catch (ArithmeticException e2) {
      System.out.println("wrong calculation");
      System.out.println(e2.getMessage());
    } catch (Exception e) {
      System.out.println("unknown error");
      System.out.println(e.getMessage());
    }
  }
}
