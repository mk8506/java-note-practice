public class Practice1 {
  public static void main(String[] args) {
    int[] data = {1,5,2,4,3};
    for (int i=0; i<data.length; i++) {
      System.out.print(data[i]);
    } System.err.println();
    for (int i=0; i<data.length/2; i++) {
      int k = data.length -i -1;  //the other side element
      int tmp = data[i];
      data[i] = data[k];
      data[k] = tmp;
    }
    for (int i=0; i<data.length; i++) {
      System.out.print(data[i]);
    } System.out.println();

    for (int i=0; i<data.length -1; i++) {
      for (int j=i+1; j<data.length; j++) {
        if (data[i] < data[j]) {
          int tmp = data[i];
          data[i] = data[j];
          data[j] = tmp;
        }
      }
    }
    for (int i=0; i<data.length; i++) {
      System.out.print(data[i]);
    } System.err.println();

    int[] data1 = {1,5,2,4,3};
    int max = data1[0];
    for (int i=1; i<data1.length; i++) {
      if (max < data1[i]) {
        max = data1[i];
      }
    }
    System.out.println("max: " + max);
  }
}
