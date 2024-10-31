package kr.minj.service;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public class DepartmentService {
  @GET("http://localhost:3001/department/{id}")
  Call<Department> addDepartment(@Path("id") int id);
}
