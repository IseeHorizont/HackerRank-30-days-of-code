//import java.util.Scanner;
//
//class Calculator{
//    public int power(int n, int p){
//        if(n < 0 || p < 0){
//            throw new IllegalArgumentException("n and p should be non-negative");
//        }
//        if(p == 0){
//            return 1;
//        }else if(p == 1){
//            return n;
//        }
//        return (int)Math.pow(n, p);
//    }
//}
//
//public class Day17 {
//    /**
//     * Day 17: More Exceptions
//     */
//
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        while (t-- > 0) {
//
//            int n = in.nextInt();
//            int p = in.nextInt();
//            Calculator myCalculator = new Calculator();
//            try {
//                int ans = myCalculator.power(n, p);
//                System.out.println(ans);
//            }
//            catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        }
//        in.close();
//    }
//}
