import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Day 26: Nested Logic
 */
public class Day26 {
    //9 6 2015    day = 9, month = 6, year = 2015 (date returned)
    //6 6 2015    day = 6, month = 6, year = 2015 (date due)

    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        int fine = 0;

        String first = scan.nextLine();
        String second = scan.nextLine();
        DateFormat format = new SimpleDateFormat("dd MM yyyy");
        Date d1 = format.parse(first);
        Date d2 = format.parse(second);

        Calendar dateReturn = Calendar.getInstance();
        dateReturn.setTime(d1);
        Calendar dateExpect = Calendar.getInstance();
        dateExpect.setTime(d2);

        if (dateReturn.equals(dateExpect) || dateReturn.before(dateExpect)) {
            fine = 0;
        }
        else if (dateReturn.after(dateExpect) && dateReturn.get(Calendar.YEAR) == dateExpect.get(Calendar.YEAR)) {
            if (dateReturn.get(Calendar.MONTH) == dateExpect.get(Calendar.MONTH)) {
                fine = 15 * (dateReturn.get(Calendar.DAY_OF_MONTH) - dateExpect.get(Calendar.DAY_OF_MONTH));
            } else {
                fine = 500 * (dateReturn.get(Calendar.MONTH) - dateExpect.get(Calendar.MONTH));
            }
        }
        else {
            fine = 10000;
        }
        System.out.println(fine);
    }
}
