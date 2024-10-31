package kr.minj.openapi;

import java.util.Scanner;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Movies {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("data; ");
    String target = scan.nextLine();
    scan.close();

    Retrofit retrofit = RetrofitHelper.getInstance().getRetrofit("");

    BoxOfficeService servic = retrofit.create(BoxOfficeService.class);

    Call<BoxOffice> call = service.getBoxOffice(target);

    call.enqueue(new Callback<BoxOffice> () {

      @Override
      public void onResponse(Call<BoxOffice> call, Response<BoxOffice> response) {
        System.out.println("success");
      }

      @Override
      public void onFailure(Call<BoxOffice> call, Throwable t) {
        System.out.println("error");
        throw new UnsupportedOperationException("Unimplemented method 'onFailure'");
      }

    })

    RetrofitHelper.getInstance().shutdown();
  }
}
