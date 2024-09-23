
import java.util.Scanner;

public class PrePostOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = createFromPrePost(pre, post);
    }
    public class Node {
        int val;
        Node left;
        Node right;
        Node root;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    static int preIndex = 0;
    static  int postIndex = 0;

    public static Node createFromPrePost(int[] pre, int[] post){
        if(preIndex >= pre.length || postIndex >= post.length){
            return null;
        }
        Node root = new Node(pre[preIndex++]);
    }
}
