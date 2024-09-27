class Member {
  String userName = "name";
  String email = "email";
  int age = 0;
}

class Calc {
  public int plus(int x, int y) {
    return x + y;
  }
  public int min(int x, int y) {
    return x - y;
  }
}

class Hello {
  String msg;
  void sayHello() {System.out.println(msg);}
  void setHello () {msg = "Hello Java";}
  void setHi() {msg = "Hi java";}
}

public class Classss {
  public static void main(String[] args) {
    Member m1 = new Member();
    System.out.println(m1.userName);
    System.out.println(m1.email);
    System.out.println(m1.age);

    Member m2 = new Member();
    System.out.println(m2.userName);
    System.out.println(m2.email);
    System.out.println(m2.age);

    m1.userName = "mino";
    m1.email = "mino@gmail.com";
    m1.age = 20;

    m2.userName = "lynny";
    m2.email = "ly@gmail.com";
    m2.age = 19;

    System.out.println(m1.userName);
    System.out.println(m1.email);
    System.out.println(m1.age);

    System.out.println(m2.userName);
    System.out.println(m2.email);
    System.out.println(m2.age);

    Calc c = new Calc();
    System.out.println(c.plus(1,2));
    System.out.println(c.min(10,5));

    Hello hello = new Hello();
    hello.setHello();
    hello.sayHello();
    hello.setHi();
    hello.sayHello();
  }
}
