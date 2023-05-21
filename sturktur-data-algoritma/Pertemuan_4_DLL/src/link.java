public class link {
    public int data;
    public link next;
    public link prev;

    public link(int d){
        data = d;
        next = null;
        prev = null;
    }

    public void displaynode(){
        System.out.print(data + " ");
    }

}
