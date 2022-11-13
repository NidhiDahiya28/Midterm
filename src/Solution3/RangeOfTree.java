package Solution3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RangeOfTree {
    public List<Integer> findValuesWithInRange(Node node, int rangeLower, int rangeHigher, List<Integer> res) {
        if (node == null) {
            return res;
        }
        if (rangeLower < node.data) {
            findValuesWithInRange(node.left, rangeLower, rangeHigher,res);
        }
        if (rangeLower <= node.data && rangeHigher >= node.data) {
            res.add(node.data);
        }
        findValuesWithInRange(node.right, rangeLower, rangeHigher,res);
        return res;
    }

    public static void main(String[] args) {
        RangeOfTree tree = new RangeOfTree();
        List<Integer> res = new ArrayList<>();
        int rangeLower = 5, rangeHigher = 8;
        Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.left.right.left = new Node(4);
        root.left.right.right = new Node(7);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);
        tree.findValuesWithInRange(root, rangeLower, rangeHigher,res);
        System.out.println(Arrays.asList(res));

    }


}
