class MyBook {
  String title;
  int pages;
  String author;

  MyBook() {
    this("no title", 0, "no name");
  }

  MyBook(String title) {
    this(title, 0, "no name");
  }

  MyBook(String title, int pages) {
    this(title, pages, "no name");
  }

  MyBook(String title, int pages, String author) {
    System.out.println("constructor created");
    this.title = title;
    this.pages = pages;
    this.author = author;
  }

  public void printObjects() {
    System.out.println(title);    
    System.out.println(pages);    
    System.out.println(author);    
  }
}

public class Constr {
  public static void main(String[] args) {
    MyBook myBook = new MyBook("java textbook", 400, "professor g.k");
    myBook.printObjects();
    System.out.println("--------------");

    MyBook myBook1 = new MyBook();
    myBook1.printObjects();
    System.out.println("--------------");

    MyBook myBook2 = new MyBook("java textbook");
    myBook2.printObjects();
    System.out.println("--------------");

    MyBook myBook3 = new MyBook("java textbook", 400);
    myBook3.printObjects();
  }
}
