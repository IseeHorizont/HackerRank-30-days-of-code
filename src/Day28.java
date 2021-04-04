import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Day 28: RegEx, Patterns, and Intro to Databases
 */

public class Day28 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        ArrayList<String> list = new ArrayList<>();
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];

            Pattern pattern = Pattern.compile("(@gmail.com)$");
            Matcher matcher = pattern.matcher(emailID);
            if (matcher.find()) {
                list.add(firstName + " " + emailID);
            }
        }
        scanner.close();

        Collections.sort(list);
        for (String item : list) {
            System.out.println(item);
        }
    }
}
