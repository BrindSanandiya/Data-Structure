import java.util.Scanner;

class Node {

    int info;
    Node link;

    Node(int info) {
        this.info = info;
        this.link = null;
    }
}

class LinkedList {

    Node first = null;

    void insert(int info) {
        Node newNode = new Node(info);
        if (first == null) {
            first = newNode;
        } else {
            Node temp = first;
            while (temp.link != null) {
                temp = temp.link;
            }
            temp.link = newNode;
        }
    }

    void display() {
        Node save = first;
        while (save != null) {
            System.out.println(save.info + " ");
            save = save.link;
        }
        System.out.println();
    }

    Node copy() {
        LinkedList newList = new LinkedList();
        Node save = this.first;
        Node newfirst = null;
        Node last = null;

        while (save != null) {
            Node newNode = new Node(save.info);
            if (newfirst == null) {
                newfirst = newNode;
                last = newNode;
            } else {
                last.link = newNode;
                last = last.link;
            }
            save = save.link;
        }
        newList.first = newfirst;
        display();
        return newfirst;
    }
}

public class RevLinkedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList originalList = new LinkedList();
        System.out.println("Enter the elements of linked list");
        String input;
        while (true) {
            input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("Done")) {
                break;
            }
            try {
                int num = Integer.parseInt(input);
                originalList.insert(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid number or 'done' to finish");

            }
        }
        System.out.println("Original Linked List: ");
        originalList.display();
        System.out.println("Copied Linked List: ");
        originalList.copy();
        sc.close();
    }
}
