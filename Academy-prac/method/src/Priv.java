public class Priv {
  private String name;
  private int age;

  public Priv(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public String getName(String name) {
    return this.name;
  }
  public int getAge(int age) {
    return this.age;
  }
}