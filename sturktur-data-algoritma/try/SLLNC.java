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

    // ===================================================
    // insert before tail
    public void insertBeforeTail(int dataBaru){
        Node nodeBaru = new Node(dataBaru);
        if(isEmpty()){
            head = nodeBaru;
        }
        else{
            Node tail = head;
            Node temp = head;
            Node temp2 = head;
            while(tail.next != null){
                tail = tail.next;
            }
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = nodeBaru;
            nodeBaru.next = tail;
        }
    }

    // insert middle
    public void insertMiddle(int dataBaru){
        Node nodeBaru = new Node(dataBaru);
        if(isEmpty()){
            head = nodeBaru;
        }
        else{
            Node middle = head;
            Node temp = head;

            int tengah = jumlahNode() / 2;
            for (int i = 1; i<tengah; i++){
                middle = middle.next;
            }
            temp = middle.next;
            middle.next = nodeBaru;
            nodeBaru.next = temp;
        }
    }

    // delete middle
    public void deleteMiddle(){
        if(isEmpty()){
            System.out.println("linked list kosong");
        }
        else if(head.next==null){
            head = null;
        }
        else{
            Node middle = head;
            Node temp = head;
            Node temp2 = head;

            int tengah = jumlahNode() / 2;
            for (int i = 1; i<=tengah; i++){
                middle = middle.next;
            }
            while(temp.next != middle){
                temp = temp.next;
            }
            temp2 = middle.next;
            middle = null;
            temp.next = temp2;
        }
    }

    // delete before tail
    public void deleteBeforeTail(){
        if(isEmpty()){
            System.out.println("linked list kosong");
        }
        else if(head.next==null){
            head = null;
        }
        else{
            Node tail = head;
            Node delete = head;
            Node temp = head;
            while(tail.next != null){
                tail = tail.next;
            }
            while(delete.next != tail){
                delete = delete.next;
            }
            while(temp.next != delete){
                temp = temp.next;
            }
            delete = null;
            temp.next = tail;
        }
    }
    // ===================================================

    // menghitung jumlah node pada linked list
    public int jumlahNode(){
        int jumlah = 0;
        if(isEmpty() ==  true){
//            System.out.println("Jumlah node : " + jumlah);
        }
        else {
            Node temp = head;
            if(head.next == null){
                jumlah = 1;
//                System.out.println("Jumlah node : " + jumlah);
            }
            else{
                jumlah = 1;
                while(temp.next != null){
                    temp = temp.next;
                    jumlah += 1;
                }
//                System.out.println("Jumlah node : " + jumlah);
            }
        }
        return jumlah;
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
        SLLNC list = new SLLNC();

        list.insertFirst(10);
        list.insertFirst(20);
        list.print();

        System.out.println();
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);
        list.insertLast(60);
        list.insertLast(70);
        list.print();

        System.out.println("\n\ninsert before tail");
        list.insertBeforeTail(15);
        list.print();

        System.out.println("\n\ninsert middle");
        list.insertMiddle(15);
        list.print();

        System.out.println("\n\ndelete before tail");
        list.deleteBeforeTail();
        list.print();
        System.out.println();
        list.deleteBeforeTail();
        list.print();

        System.out.println("\n\ndelete middle");
        list.deleteMiddle();
        list.print();

    }
}