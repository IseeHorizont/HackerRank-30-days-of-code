import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Day 23: BST Level-Order Traversal
 */

public class Day23 {
    static void levelOrder(Node root){
        //Write your code here
        ArrayDeque<Node> q = new ArrayDeque<>();
        Node n = root;

        while (n != null) {
            System.out.print(n.data + " ");

            if (n.left != null) {
                q.addLast(n.left); // insert element at the end
            }
            if (n.right != null) {
                q.addLast(n.right);
            }
            if (!q.isEmpty()) {
                n = q.getFirst(); // first element
                q.pop();        // removes first element
            } else {
                n = null;
            }
        }

    }
    public static Node insert(Node root,int data){
        if(root == null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }
            else{
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while(T --> 0){
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
