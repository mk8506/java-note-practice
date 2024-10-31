package kr.minj.service;
import java.util.List;
import kr.minj.model.Department;
import kr.minj.model.Titanic;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MySchoolService {
  @GET("/department")
  Call<List<Department>> getDepartments();
  @GET("/titanic")
  Call<List<Titanic>> getTitanics();
}
