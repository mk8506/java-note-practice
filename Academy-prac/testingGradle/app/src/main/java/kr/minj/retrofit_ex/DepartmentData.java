package kr.minj.retrofit_ex;

import java.util.List;

import kr.minj.model.Department;
import kr.minj.service.MySchoolService;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DepartmentData {
  public static void main(String[] args) {
    String url = "http://localhost:3001";
    OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
    OkHttpClient httpClient = httpClientBuilder.build();
    Retrofit.Builder builder = new Retrofit.Builder();
    builder.baseUrl(url);
    builder.addConverterFactory(GsonConverterFactory.create());
    builder.client(httpClient);
    Retrofit retrofit = builder.build();
    MySchoolService service = retrofit.create(MySchoolService.class);
    Call<List<Department>> call = service.getDepartments();
    call.enqueue(new Callback<List<Department>>() {
      @Override
      public void onResponse(Call<List<Department>> call, Response<List<Department>> response) {
        List<Department> list = response.body();
        for (Department d : list) {
          System.out.println(d);
        }
      }
      @Override
      public void onFailure(Call<List<Department>> call, Throwable t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onFailure'");
      }   
    });
    httpClient.dispatcher().executorService().shutdown();
  }
}
