public class Node {
    String data;
    Node next;

    public Node(String data){
        this.data = data;
        next = null;
    }

    public void display(){
        System.out.println("Data pada node "+data);
    }
}


