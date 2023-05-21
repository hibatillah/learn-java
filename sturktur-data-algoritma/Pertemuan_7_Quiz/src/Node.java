public class Node {
    public int iData;
    public float fData;
    public Node leftChild;
    public Node rightChild;

    public Node(int id, float fd){
        iData = id;
        fData = fd;
        leftChild = null;
        rightChild = null;
    }

    public void displayNode(){
        System.out.println(iData + ", " + fData);
    }
}
