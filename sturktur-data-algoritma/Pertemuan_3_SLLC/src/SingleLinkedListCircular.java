public class SingleLinkedListCircular {
    Node head, tail;

    public SingleLinkedListCircular(){

    }
    //mengecek LL kosong atau tidak
    public boolean isEmpty(){
        if(head == null)
            return true;
        else
            return false;
    }

    public void insertFirst(String dataBaru){
        Node nodeBaru = new Node(dataBaru);
        nodeBaru.next = nodeBaru;

        if(isEmpty() == true){
            head = nodeBaru;
        } else {
            if (head.next == head){
                nodeBaru.next = head;
                head.next = nodeBaru;
                head = nodeBaru;
            }
            else{
                tail = head;
                while(tail.next != head){
                    tail = tail.next;
                }
                tail.next = nodeBaru;
                nodeBaru.next = head;
                head = nodeBaru;
            }
        }
    }

    public void insertLast(String dataBaru){
        Node nodeBaru = new Node(dataBaru);
        if(!isEmpty()){
            Node tail = head;
            while(tail.next != head){
                tail = tail.next;
            }
            tail.next = nodeBaru;
            nodeBaru.next = head;
        }
        else{
            head = nodeBaru;
        }
    }

    public void deleteFirst(){
        Node del;

        if(head.next == head){
            head = null;
        } else{
            tail = head;
            del = head;
            while(tail.next != head){
                tail = tail.next;
            }
            head = head.next;
            del = null;
            tail.next = head;
        }
    }

    public void deleteLast(){
        if(isEmpty()){
            System.out.println("linked list koosng");
        }
        else if (head.next==head){
            head = null;
        }
        else{
            Node tail = head;
            Node temp = head;
            while(tail.next != head){
                tail = tail.next;
            }
            while(temp.next != tail){
                temp = temp.next;
            }
            tail = null;
            temp.next = head;
        }
    }

    public void printAll() {
        if (isEmpty() == false) {
            tail = head;
            do {
                System.out.println(tail.data + " ");
                tail = tail.next;
            }
            while (tail != head);
        } else {
            System.out.println("lingked list kosong");
        }
    }

    public static void main(String[] args) {
        SingleLinkedListCircular sllc1 = new SingleLinkedListCircular();
        System.out.println("Insert First");
        sllc1.insertFirst("ali");
        sllc1.insertFirst("andika");
        sllc1.insertFirst("donita");
        sllc1.printAll();

        System.out.println("\nInsert Last");
        sllc1.insertLast("fikri");
        sllc1.insertLast("eka");
        sllc1.insertLast("ririn");
        sllc1.printAll();
//
        System.out.println("\n\nOperasi delete first");
        sllc1.deleteFirst();
        sllc1.printAll();
//
        System.out.println("\n\nDelete Last");
        sllc1.deleteLast();
        sllc1.printAll();
    }

}