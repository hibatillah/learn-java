public class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        next = null;
    }

    public void display(){
        System.out.println("Data pada node"+data);
    }
}


