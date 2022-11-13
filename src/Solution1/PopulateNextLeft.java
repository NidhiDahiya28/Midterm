package Solution1;

import java.util.LinkedList;
import java.util.Queue;

public class PopulateNextLeft {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.right.right = new Node(9);
        root.right.right.right = new Node(10);
        PopulateNextLeft sol = new PopulateNextLeft();
        Node resNode = PopulateNextLeft.connect(root);

    }


    public static Node connect(Node root) {
        if (root == null) {
            return root;
        }

        Queue<Node> Q = new LinkedList<Node>();
        Q.add(root);

        while (!Q.isEmpty()) {

            int size = Q.size();
            for (int i = 0; i < size; i++) {


                Node node = Q.poll();
                if (i < size - 1) {
                    node.next = Q.peek();
                }


                if (node.left != null) {
                    Q.add(node.left);
                }
                if (node.right != null) {
                    Q.add(node.right);
                }
            }
        }


        return root;
    }
}
