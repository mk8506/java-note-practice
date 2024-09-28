import java.io.File;

public class Files {
  public static void main(String[] args) {
    File f = new File("./test.txt");
    System.out.println(f.isFile());
    System.out.println(f.isDirectory());
    System.out.println(f.isHidden());
    System.out.println(f.getAbsolutePath());
    System.out.println(f.exists());

    File g = new File("a/b/c/target");
    g.mkdirs();
    System.out.println(g.getName());
    System.out.println(g.getParent());
  }
}
