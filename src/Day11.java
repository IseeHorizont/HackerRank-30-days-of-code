import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day11 {

    private static final Scanner scanner = new Scanner(System.in);

    public static int checkSquareInArray(int [][] array, int rowOffset, int columnOffset){
        int sum = 0;

        for (int i = rowOffset; i < (3 + rowOffset); i++) {
            for (int j = columnOffset; j < (3 + columnOffset); j++) {
                sum += array[i][j];
            }
        }
        sum -= (array[1+rowOffset][0+columnOffset] + array[1+rowOffset][2+columnOffset]);
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        scanner.close();

        List<Integer> sumList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sumList.add(checkSquareInArray(arr, i, j));
                //System.out.print(checkSquareInArray(arr, i, j) + " ");
            }
        }
        //System.out.println();
        System.out.println(Collections.max(sumList));
    }
}
