public class Prac {
  static class TV {
    private int size;

    public int getSize() {
      return this.size;
    }

    public void setSize(int size) {
      this.size = size;
    }
  }

  static class ColorTV extends TV {
    private int colorCount;

    public int getColorCount() {
      return this.colorCount;
    }

    public void setColorCount(int colorCount) {
      this.colorCount = colorCount;
    }

    public void printInfo() {
      System.out.printf("%dinch %dcolor", super.size, this.colorCount);
    }
  }

  public static void main(String[] args) {
    ColorTV mytv = new ColorTV();
    mytv.setSize(32);
    mytv.setColorCount(1024);
    mytv.printInfo();
  }
}