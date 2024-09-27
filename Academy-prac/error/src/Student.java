public class Student {
  private String name;
  private int kor;
  private int math;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getKor() {
    return this.kor;
  }

  public void setKor(int kor) throws MyKorException {
    if (kor < 0 || kor > 100) {
      throw new MyKorException();
    }
    this.kor = kor;
  }

  public int getMath() {
    return this.math;
  }

  public void setMath(int math) throws MyMathException {
    if (math < 0 ) {
      throw new MyMathException("lower than 0");
    } if (math > 100) {
      throw new MyMathException("exceeded 100");
    }
    this.math = math;
  }

}
