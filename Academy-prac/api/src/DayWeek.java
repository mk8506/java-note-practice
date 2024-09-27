import java.util.Calendar;

public class DayWeek {
public static void main(String[] args) {
  Calendar cal = Calendar.getInstance();

  int weekCnt = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);
  int dayCnt = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

  cal.set(Calendar.DAY_OF_MONTH, 1);
  int firstDay = cal.get(Calendar.DAY_OF_WEEK);
  int[][] data = new int[weekCnt][7];

  int count = 1;

  for (int i=0; i<data.length; i++) {
    for (int j=0; j<data[i].length; j++) {
      if (!(i==0 && j+1 < firstDay) && count <= dayCnt) {
        data[i][j] = count;
        count++;
      }
    }
  }

  for (int i=0; i<data.length; i++) {
    for (int j=0;j<data[i].length; j++) {
      if (data[i][j] == 0) {
        System.out.println("\t");
      } else {
        System.out.println(data[i][j]);
      }
    }
  }
}
}
