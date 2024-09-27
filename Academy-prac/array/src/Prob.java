public class Prob {
  public static void main(String[] args) {
    //#1
    // int[] grade = {75, 82, 91};
    // int sum = 0;
    // for (int i=0; i<grade.length; i++) {
    //   sum += grade[i];
    // }
    // System.out.printf("sum: %d \n", sum);
    // int avg = sum / grade.length;
    // System.out.printf("avg: %d", avg);

    //#2
    // int[] hr = {7, 5, 5, 5, 5, 10, 7};
    // int sum = 0;
    // int hrearn = 4500;
    // for (int i=0; i<hr.length; i++) {
    //   if (i>3) {hrearn = 5200;}
    //   sum += hr[i]*hrearn;
    // }
    // System.out.printf("earned: %d", sum);

    //#3
    // int[] price = {380, 200, 179, 179};
    // int[] qty = {6, 4, 3, 5};
    // int money = 0;
    // for (int i=0; i<price.length; i++) {
    //   money += (price[i] * qty[i]);
    // }
    // System.out.printf("payment: %d", money*100);

    //#4
    // int[] price = {380, 200, 179, 179};
    // int[] qty = {6, 4, 3, 5};
    // int[] money = new int[4];
    // for (int i=0; i<price.length; i++) {
    //   money[i] = (price[i] * qty[i]);
    // }
    // System.out.print("money: ");
    // for (int i=0; i<money.length; i++) {
    //   System.out.printf("%d ", money[i]*100);
    // }
    // int max = money[0];
    // for (int i=1; i<money.length; i++) {
    //   if (max < money[i]) {
    //     max = money[i];
    //   }
    // }
    // System.out.printf("\nmax: %d ", max*100);

    //#5
    // int[] price = {380, 200, 179, 179};
    // int[] qty = {6, 4, 3, 5};
    // int[] money = new int[4];
    // for (int i=0; i<price.length; i++) {
    //   money[i] = (price[i] * qty[i]);
    // }
    // System.out.print("money: ");
    // for (int i=0; i<money.length; i++) {
    //   System.out.printf("%d ", money[i]*100);
    // }
    // int cnt = 0;
    // for (int i=0; i<money.length; i++) {
    //   if (money[i] >= 800) {
    //     cnt++;
    //   }
    // }
    // System.out.printf("\ncnt: %d ", cnt);

    //#6
    // int[] money = {209, 109, 119, 109, 94};
    // for (int i=0; i<money.length -1; i++) {
    //   for (int j=i+1; j<money.length; j++) {
    //     if (money[i] > money[j]) {
    //       int tmp = money[i];
    //       money[i] = money[j];
    //       money[j] = tmp;
    //     }
    //   }
    // }
    // System.out.print("Lowest to highest: ");
    // for (int i=0; i<money.length; i++) {
    //   System.out.printf("%d ", money[i]*100);
    // }

    //#7
    // int[] arr = {5, 3, 2, 8, 9};
    // for (int i=0; i<arr.length; i++) {
    //   System.out.print(arr[i]);
    // }
    // for (int i=0; i<arr.length/2; i++) {
    //   int k = arr.length -i -1;  //the other side element
    //   int tmp = arr[i];
    //   arr[i] = arr[k];
    //   arr[k] = tmp;
    // }
    // for (int i=0; i<arr.length; i++) {
    //   System.out.print(arr[i]);
    // }

    //#8
    // String[] names = {"jae", "min", "jong", "gwang", "seng", "sae"};
    // int[] points = {82, 91, 54, 62, 88, 90};
    // for (int i=0; i<points.length -1; i++) {
    //   for (int j=i+1; j<points.length; j++) {
    //     if (points[i] < points[j]) {
    //       int tmp = points[i];
    //       points[i] = points[j];
    //       points[j] = tmp;
    //       String tmp1 = names[i];
    //       names[i] = names[j];
    //       names[j] = tmp1;
    //     }
    //   }
    // }
    // System.out.print("Highest to Lowest: ");
    // for (int i=0; i<names.length; i++) {
    //   System.out.printf("%s ", names[i]);
    // }

    //#9
    // int[] cheol = {1, 5, 7};
    // char[] cheol1 = {'J', 'Q', 'A'};
    // int[] young = {2, 3, 4, 5};
    // char[] young1 = {'Q', 'K', 'A'};
    // int cnt = 0;
    // for (int i=0; i<young.length; i++) {
    //   for (int j=0; j<cheol.length; j++) {
    //     if (young[i] == cheol[j]) {
    //       System.out.printf("%d: %d \n", j, cheol[j]);
    //       cnt++;
    //     }
    //   }
    // }
    // for (int i=0; i<young1.length; i++) {
    //   for (int j=0; j<cheol1.length; j++) {
    //     if (young1[i] == cheol1[j]) {
    //       System.out.printf("%d: %c \n", j + cheol.length, cheol1[j]);
    //       cnt++;
    //     }
    //   }
    // }
    // System.out.printf("cnt: %d ", cnt);

    //#10
    // int[] laptop = {977750, 1649000, 1738950, 549000, 1419000, 479000, 2098000, 519000, 2449000, 1498000};
    // int cnt = 0;
    // for (int i=0; i<laptop.length; i++) {
    //   if (laptop[i] <= 1700000 && laptop[i] >= 1400000) {
    //     cnt++;
    //   }
    // }
    // System.out.printf("cnt: %d ", cnt);

    //#11
    // String[] student = {"dul", "do", "ddo", "hee"};
    // int[][] grade = {{78, 89, 96}, {62, 77, 67}, {54, 90, 80}, {100, 99, 98}};
    // int[] sum = new int[student.length];
    // float[] avg = new float[student.length];
    // for (int i=0; i<student.length; i++) {
    //   for (int j=0; j<grade[i].length; j++) {
    //     sum[i] += grade[i][j];
    //   }
    // }
    // for (int i=0; i<avg.length; i++) {
    //   avg[i] = (float)sum[i] / (float)grade[i].length;
    // }
    // System.out.printf("sum, avg: \n");
    // for (int i=0; i<sum.length; i++) {
    //   System.out.printf("%s: %d, %.2f \n", student[i], sum[i], avg[i]);
    // }

    //#12
    // String[] student = {"dul", "do", "ddo", "hee"};
    // int[][] grade = {{78, 89, 96}, {62, 77, 67}, {54, 90, 80}, {100, 99, 98}};
    // int[] sum = new int[student.length];
    // float[] avg = new float[student.length];
    // for (int i=0; i<student.length; i++) {
    //   for (int j=0; j<grade[i].length; j++) {
    //     sum[i] += grade[i][j];
    //   }
    // }
    // float avgsum = 0;
    // for (int i=0; i<avg.length; i++) {
    //   avg[i] = (float)sum[i] / (float)grade[i].length;
    //   avgsum += avg[i];
    // }
    // avgsum = avgsum / (float)student.length;
    // System.out.printf("%.2f", avgsum);

    //#13
    
  }
}
