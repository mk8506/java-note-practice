public class Practice {
  public static void main(String[] args) {
    int[] arr1; //create
    arr1 = new int[3];  //init
    System.out.println(arr1[0]);  //0
    System.out.println(arr1[1]);
    System.out.println(arr1[2]);

    int[] arr2 = new int[4];
    for (int i=0; i<arr2.length; i++) {
      arr2[i] = i*10;
      System.out.println(arr2[i]);  //correct
    }

    System.out.println(arr2); //nope

    boolean[] checked = {true, false, false, true, false};
    for (int i=0; i<checked.length; i++) {
      checked[i] = !checked[i];
    }
    for (int i=0; i<checked.length; i++) {
      System.out.print(checked[i] +"\t");
    }
  }
}