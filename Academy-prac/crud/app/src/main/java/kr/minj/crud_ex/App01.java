/*
 * This source file was generated by the Gradle 'init' task
 */
package kr.minj.crud_ex;

import java.util.Scanner;
import kr.minj.helper.RetrofitHelper;
import retrofit2.*;

public class App01 {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("name: ");
      String dname = scanner.nextLine();
      System.out.println("location: ");
      String loc = scanner.nextLine();
      scanner.close();

      Retrofit retrofit = RetrofitHelper.getInstance().getRetrofit("url");
    }
}