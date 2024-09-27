import kr.minj.helper.UtilHelper;

// 6 digit random number
public class Random {
  public static void main(String[] args) {
    UtilHelper util = UtilHelper.getInstance();

    String Auth = "";
    for (int i = 0; i<6; i++) {
      Auth += util.random(0,9);
    }
    System.out.println(Auth);
  }
}
