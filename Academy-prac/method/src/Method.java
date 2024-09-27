public class Method {
  public static void main(String[] args) {
    int a = div(10, 2);
    System.out.println(a);
    int b = div(3,0);
    System.out.println(b);
  }

  public static int div(int x, int y) {
    if (y==0) {
      System.out.println("cannot be divded with 0");
      return 0;
    }

    return x/y;
  }
}