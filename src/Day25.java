import java.util.Scanner;

/**
 * Day 25: Running Time and Complexity
 */
public class Day25 {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT.
    Your class should be named Solution. */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            if (checkNumForPrime(scan.nextInt()) == true) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }

    }

    public static boolean checkNumForPrime(int num) {
        int div = 2;
        while (div * div <= num && num % div != 0) {
            div += 1;
        }
        return div * div > num;
    }
}
