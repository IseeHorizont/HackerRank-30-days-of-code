import java.util.Scanner;

public class Day14 {
    /**
     * Day 14: Scope
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] array){
        this.elements = array;
    }

    public void computeDifference(){
        int maxi = 0;
        for (int i = 0; i < elements.length; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                int dif = Math.abs(elements[i] - elements[j]);
                if(dif > maxi){
                    maxi = dif;
                }
            }
        }
        maximumDifference = maxi;
    }
}
