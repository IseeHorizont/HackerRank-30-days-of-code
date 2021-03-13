import java.util.Scanner;

public class Day6 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] inputWord = new String[n];

        for(int i = 0; i < n; i++){
            inputWord[i] = scanner.nextLine();
        }
        String leftSide = "";
        String rightSide = "";

        String[] res = new String[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < inputWord[i].length(); j++) {
                if(j % 2 == 0){
                    leftSide += inputWord[i].charAt(j);
                }else{
                    rightSide += inputWord[i].charAt(j);
                }
            }
            res[i] = (leftSide + " " + rightSide);
            leftSide = "";
            rightSide = "";
        }

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
