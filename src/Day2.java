import java.util.Scanner;

public class Day2 {
    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        System.out.print(Math.round(meal_cost + (meal_cost / 100 * tip_percent)
                                                + (meal_cost / 100 * tax_percent)));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
