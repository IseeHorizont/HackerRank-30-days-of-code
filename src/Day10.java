import java.util.*;

/**
 * Day 10: Binary Numbers
 */

public class Day10 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<Integer> list = new LinkedList<>();
        //TODO 125 -> 1111101
        //TODO 439 -> 110110111
        while(n > 0){
            list.add(n % 2);
            n /= 2;
        }

        int countBegin = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            if(list.get(i) != 0){
                //System.out.print(list.get(i));
                countBegin++;
            }else{
                break;
            }
        }

        int countEnd = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) != 0){
                //System.out.print(list.get(i));
                countEnd++;
            }else{
                break;
            }
        }

        System.out.println(countBegin > countEnd ? countBegin : countEnd);



        scanner.close();
    }
}
