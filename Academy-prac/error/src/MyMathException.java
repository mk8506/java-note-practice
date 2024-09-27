public class MyMathException extends Exception  {
  public MyMathException() {
    super("out of range");
  }
  
  public MyMathException(String message) {
    super(message);
  }  
}