package Solution4;

public class InsertList {Node head; // head of list
    public int length = 0;
    public InsertList() {
        head = null;
    }

    public void insert(Node new_node)
    {
        Node current;
        if (head == null || head.data
                >= new_node.data) {
            new_node.next = head;
            head = new_node;
        }
        else {

            current = head;
            while (current.next != null
                    && current.next.data < new_node.data)
                current = current.next;
            new_node.next = current.next;
            current.next = new_node;
        }
    }

    public Node newNode(int data)
    {
        Node x = new Node(data);
        return x;
    }

    public void printLinkedList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String args[])
    {
        InsertList list = new InsertList();
        int [] inputArray ={5,2,4,8,1,3};
        Node node;
        for(int i:inputArray){
            node = list.newNode(i);
            list.insert(node);
        }
        System.out.println("New Linked List");
        list.printLinkedList();
    }
}
