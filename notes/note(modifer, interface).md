# modifiers

## access modifiers

### for classes

- public: all classes

- default: same package

### for attributes, methods and constructors

- public: all classes

- **private**: within the declared class

- default: same package

- protected: same package & subclasses

## non-access modifiers

### for classes

- final: cannot be inherited

- abstract: cannot be used to create objects

#### for attribtues and methods

- final: cannot be overridden/modified

- **static**: accessed without creating an object 
걸쳐있다. 원본 클래스에 바로 접근
it's shared among all objects of MyClass.
객체를 여러 개 만들지 않아도 된다는 장점
RAM: STACK(고정) + HEAP(동적)
static은 stack에 저장됨(?)
프로그램 시작과 동시에 static 갖는 애들이 클래스 시작과 상관없이 시작됨
Static blocks are executed when the class is loaded.

- **abstract**: only for methods, only used in an abstract class, does not have a body, which is provided by the subclass
추상 메서드: 중괄호 없이 세미콜론으로 마무리
선언만 가능하고 할당은 안 됨
무조건 자식 클래스가 override 해야함
+- 처럼 {abstract}라고 앞에 붙임
중괄호 안의 내용을 implement해야함 (override와 같은 의미)
public이 아닌 abstract 으로 시작
단, abstract method는 abstract class내에서만 선언가능
ctrl + . -> auto generate

---EX
//Hello class, World method, Child childclass

//abstract class
abstract class Hello {
  abstract World();
}

//public class
public class Hello {
  public abstract World();
}

public class Child extends Hello {
  @override
  public void World() {
    print("hello world");
  }
}

Child c = new Child();
c.World();

---Prac.Abstract

Parent class:
1. private {type} {name};
2. constructor
3. getters & setters
4. public abstract {type} {name}();
5. @Override (methods in Object class)

Child class:
0. extends {parent class name}
1. parent's constructor
public {name}({paras}) {
  super({paras});
}
2. @Override (abstract methods from the parent class)
2-1. insert content to the abstract methods

Main class:
1. create new objects
A a = new A();
2. use methods
a.{method}();

- transient: skipped when serializing the object containing them

- synchronized: one thread at a time

- volatile: main memory, not cached thread-locally


# interface
only abstract methods included
public interface {name} {
  (declaration only)
}
public class Child extends Parent implements {interface name}, {interface name 1} {}

---Prac.Interface
Parent class:
1.instance and only abstract methods

Interface:
1. public {type} {name}();

Main class:
1. public class Child extends Parent implements {interface}, {interface} {}
2. ctrl + . -> override