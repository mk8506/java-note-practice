public class Prac {
  public static void main(String[] args) {
    //243 564
    int[] a = {2,4,3};  //1 ~ 100
    int[] b = {5,6,4};
    int[] c = new int[3];

    int aa = 0;
    for (int i=a.length-1; i>-1; i--) { //O(n)
      int deci = 1;
      for (int j=0; j<i; j++) {
        deci *= 10;
      }
      aa += a[i]*deci;
    }
    System.out.println(aa);

    int bb = 0;
    for (int i=b.length-1; i>-1; i--) { //O(n)
      int deci = 1;
      for (int j=0; j<i; j++) {
        deci *= 10;
      }
      bb += b[i]*deci;
    }
    System.out.println(bb);

    int cc = aa + bb;
    System.out.println(cc);

    for (int i=0; i<c.length; i++) {  //O(n)
      if (i==0) {
        c[i] = cc % 10;
      }
      if (i==1) {
        c[i] = cc % 100 - cc % 10;
      }
      if (i==2) {
        c[i] = cc / 100;
      }
      System.out.printf("%d\t", c[i]);
    }
  }
}

//https://medium.com/@ChrisBader/code-conquer-leetcode-2-add-two-numbers-d8f1ebd56bc4
