public class MyKorException extends Exception {
  public MyKorException() {
    super("out of range");
  }

  public MyKorException(String message) {
    super(message);
  }
}
