package kr.minj.gradleTest;
import kr.minj.helper.FileHelper;
import com.google.gson.Gson;
import lombok.Data;

@Data
class Data01 {
  private String message;
}

public class One {
  public static void main(String[] args) {
    System.out.println("hello");
    String json = null;
    try {
      json = FileHelper.getInstance().readString("res/01.json");
      System.out.println(json);
    } catch (Exception e) {
      e.printStackTrace();
      return;
    }
    
    Gson gson = new Gson();
    Data01 data = gson.fromJson(json, Data01.class);
    System.out.println(data.getMessage());
  }
}
