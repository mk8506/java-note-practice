/**
 * Fac
 */
public class Fac {

  public static void main(String[] args) {
    long re = fac(5);
    System.out.println(re);
    int a = sum(10);
    System.out.println(a);
    gu(1);
    for (int i=1; i<=10; i++) {
      System.out.println(fib(i));
    }
  } 

  public static int fac(int n) {
    if (n==1) {
      return 1;
    }
    return n * fac(n-1);
  }

  public static int sum(int n) {
    if (n==1) {
      return 1;
    }
    return n + sum(n-1);
  }

  public static void gu(int n) {
    if (n > 9) {
      return;
    }
    System.out.printf("%d X %d = %d\n", 7, n, 7*n);
    gu(n+1);
  }

  public static int fib(int n) {
    if (n <=1 ) {
      return n;
    } else {
      return fib(n-1) +fib(n-2);
    }
  }
}