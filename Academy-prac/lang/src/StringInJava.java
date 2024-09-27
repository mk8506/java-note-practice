public class StringInJava {
  public static void main(String[] args) {
    String msg = "Life is too short. You need Java!";
    int p = msg.indexOf("short", 5);
    System.out.println(p);
    int p1 = msg.lastIndexOf("a");
    System.out.println(p1);
    if (msg.indexOf("Hello") > -1) {
      System.out.println("included");
    } else {
      System.out.println("not included");
    }
  }
}
