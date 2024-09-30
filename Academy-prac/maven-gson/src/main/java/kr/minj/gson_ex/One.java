package kr.minj.gson_ex;
import com.google.gson.Gson; 
import kr.minj.helper.FileHelper;

class Data {
  private String message;

  public String getmessage() {
    return this.message;
  }

  public void setmessage(String message) {
    this.message = message;
  }
}

public class One {
  public static void main(String[] args) {
    String json = null;
    try {
      json = FileHelper.getInstance().readString("res/01.json");  //the whole file
      System.out.println(json);
    } catch (Exception e) {
      e.printStackTrace();
      return;
    }

    Gson gson = new Gson();
    Data data = gson.fromJson(json, Data.class);  //only the value in json to Data.class
    System.out.println(data.getmessage());
  }
}
