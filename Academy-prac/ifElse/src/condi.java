import java.util.Scanner;


public class condi {
  public static void main(String[] args) {
    System.out.print("your age: ");
    Scanner reader = new Scanner(System.in);
    int age = reader.nextInt();
    reader.close();
    int rg = age / 10;
    switch (rg) {
      case 0 :
        System.out.println("child");
        break;
      case 1 :
        System.out.println("teen");
        break;
    }
  }
}
