
class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
    }

    public void sortList() {
        Node current = head;
        while (current != null) {
            Node index = current;
            while (index.next != null) {
                if (current.data > index.next.data) {
                    int temp = current.data;
                    current.data = index.next.data;
                    index.next.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class SortLinedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(5);
        list.addNode(2);
        list.addNode(9);
        list.addNode(1);
        list.addNode(7);

        System.out.println("Before sorting:");
        list.printList();

        list.sortList();

        System.out.println("After sorting:");
        list.printList();
    }
}
