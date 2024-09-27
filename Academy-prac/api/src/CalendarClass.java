import java.util.Calendar;
import kr.minj.helper.DatePrinter;

public class CalendarClass {
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();

    int yy = cal.get(Calendar.YEAR);
    int mm = cal.get(Calendar.MONTH)+1;
    int dd = cal.get(Calendar.DAY_OF_MONTH);
    int hh = cal.get(Calendar.HOUR_OF_DAY); //-> 24 vs HOUR -> 12
    int mi = cal.get(Calendar.MINUTE);
    int ss = cal.get(Calendar.SECOND);

    System.out.printf("%d %d %d %d %d %d\n", yy, mm, dd, hh, mi, ss);
    DatePrinter.printDateTime(cal);

    cal.set(Calendar.YEAR, 2020);
    cal.set(Calendar.MONTH, 4);
    cal.set(Calendar.DAY_OF_MONTH, 5);
    cal.set(Calendar.HOUR_OF_DAY, 15); //-> 24 vs HOUR -> 12
    cal.set(Calendar.MINUTE, 30);
    cal.set(Calendar.SECOND, 33);

    DatePrinter.printDateTime(cal);

    cal.set(1834, 5, 23);
    DatePrinter.printDateTime(cal);

    cal.set(1834, 5, 23, 12, 3, 4);
    DatePrinter.printDateTime(cal);

    cal.add(Calendar.DAY_OF_MONTH, 5);
    DatePrinter.printDateTime(cal);

    // int day = cal.get(Calender.DAY_OF_WEEK);
    // System.out.println(day);
  }
}