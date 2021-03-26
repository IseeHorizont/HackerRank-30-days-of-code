import java.util.*;

/**
 * Day 18: Queues and Stacks
 */

public class Day18 {
    // Write your code here.
    public static Stack<Character> stack = new Stack();
    public static Deque<Character> deque = new ArrayDeque<>();

    public static void pushCharacter(char ch){
        stack.push(ch);
    }

    public static void enqueueCharacter(char ch){
        deque.addLast(ch);
    }

    public static char popCharacter(){
        return stack.pop();
    }

    public static char dequeueCharacter(){
        return deque.pollFirst();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Day18 object:
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            char fromStack = p.popCharacter();
            char fromDeque = p.dequeueCharacter();
            System.out.println(fromStack + " VS " + fromDeque);
            if (fromStack != fromDeque) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );


    }
}
