import java.util.Scanner;

public class CalcUse {
  public static void main(String[] args) {
    //input
    Scanner reader = new Scanner(System.in);
    System.out.println("x: ");
    int x = reader.nextInt();
    System.out.println("y: ");
    int y = reader.nextInt();
    reader.close();

    //new Calc
    Calc c = Calc.getInstance();

    //div
    int z = c.div(x,y);
    System.out.println(z);

    //divEx
    int a = 0;
    try {
      a = c.divEx(x, y);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println(a);
  }
}
