package Solution2;

public class ParentNodePop {public static void main(String[] args) {
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
    ParentNodePop populateParentNode = new ParentNodePop();
    populateParentNode.populateNode(root,null);


}


    public void  populateNode(Node root, Node parent){
        if(root==null)return;
        if(parent!=null){
            if(root.left!=null){
                root.left.parent=root;
            }
            if(root.right!=null){
                root.right.parent = root;
            }
        }else if(parent==null){
            root.parent=null;
            if(root.left!=null){
                root.left.parent=root;
            }
            if(root.right!=null){
                root.right.parent = root;
            }
        }
        populateNode(root.left,root);
        populateNode(root.right,root);
    }
}
