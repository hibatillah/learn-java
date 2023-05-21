public class SLLNC {
    Node head;

    public SLLNC(){

    }
    //mengecek LL kosong atau tidak
    public boolean isEmpty(){
        if(head == null)
            return true;
        else
            return false;
    }

    //insert node di depan
    public void insertFirst(int dataBaru){
        Node nodeBaru = new Node(dataBaru);
        if(isEmpty()){
            head = nodeBaru; //apabila node baru kosong maka node baru dijadikan sebagai head.
        }
        else{
            nodeBaru.next = head; //
            head = nodeBaru;
        }
    }

//    insert node di akhir
    public void insertLast(int dataBaru){
        Node nodeBaru = new Node(dataBaru);
        if(!isEmpty()){
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = nodeBaru;
        }
        else{
            head = nodeBaru;
        }
    }

//    delete data node pertama
    public void deleteFirst(){
        if(isEmpty()){
            System.out.println("linked list kosong");
        }
        else if(head.next==null){
            head = null;
        }
        else{
            Node hapus = head;
            head = head.next;
            hapus.next = null;
        }
    }

//    delete node terakhir
    public void deletelast(){
        if(isEmpty()){
            System.out.println("linked list koosng");
        }
        else if (head.next==null){
            head = null;
        }
        else{
            Node temp = head;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void print(){
        if(!isEmpty()){
            Node temp = head;
            while(temp!=null){
                temp.display();
                temp = temp.next;
            }
        }
        else{
            System.out.println("Linked List Kosong!");
        }
    }

    public static void main(String[] args) {
        SLLNC myList = new SLLNC();
        myList.print();
        myList.insertFirst(10);
        myList.insertFirst(20);
        myList.print();
    }
}
