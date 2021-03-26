import java.util.Scanner;

public class Day16 {
    /**
     * Day 16: Exceptions - String to Integer
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
            System.out.println(Integer.parseInt(S));
        }catch (Exception ex){
            System.out.println("Bad String");
        }
    }
}
