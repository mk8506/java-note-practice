public class Copy {
  public static void main(String[] args) {
    int[] origin = {1, 2, 3, 4, 5};
    int[] copy = new int[origin.length];
    //         copying, start index, copy to, start index, length
    System.arraycopy(origin, 0, copy, 0, origin.length);
    for (int i=0; i < copy.length; i++) {
      System.out.print(copy[i] +"\t");
    }
  }
}