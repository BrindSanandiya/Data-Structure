public class SllOpp {
    public static void main(String[] args) {
        
    }

    class Node{
        int info;
        Node link;

        public Node(int data){
            this.info = data;
            this.link = null;
        }
    }
    public Node first = null;

    public void InsertAtFirst(int data){
        Node newNode = new Node(data);

        if(first == null){
            first = newNode;
            return;
        }
        Node temp = first;
        first = newNode;
        first.link = temp;
    }


}

