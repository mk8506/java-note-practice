import java.io.FileOutputStream;
import java.io.OutputStream;

public class SaveFile {
  public static void main(String[] args) {
    String filePath = "./test.txt";
    String content = "Hello Java";

    //convert content to binary
    byte[] data = content.getBytes("utf-8");

    //write the file
    OutputStream os = new FileOutputStream(filePath); //save the data
    os.write(data); //create the file
  }
}
