import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day20 {

    /**
     * Day 20: Sorting
     */
    public static int countSwap = 0;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    countSwap++;
                }
            }
        }
        System.out.printf("Array is sorted in %d swaps.\n", countSwap);
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }
}
