public class ReadFile {
  public static void main(String[] args) {
    String filePath = "./test.txt";
    byte[] data = null;
    String content = null;

    InputStream is = new FileInputStream(filePath);
    data = new byte[is.available()];
    is.read(data);

    if (data != null) {
      content = new String(data, "utf-8");
    }
  }
}
