import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.swing.JOptionPane;

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
            head = nodeBaru;
        }
        else{
            nodeBaru.next = head; //
            head = nodeBaru;
        }
    }

    //insert node di akhir
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

    // input node setelah head
    public void insertAfterHead(int dataBaru){
        Node nodeBaru = new Node(dataBaru);
        if(isEmpty()){
            head = nodeBaru;
        }
        else{
            Node temp = head.next;
            head.next = nodeBaru;
            nodeBaru.next = temp;
        }
    }

    //delete data node pertama
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

    //delete node terakhir
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

    // mencari node
    public void search(int dataCari){
        Node nodeCari = new Node(dataCari);
        if(!isEmpty()){
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = nodeCari;
        }
        else{
            head = nodeCari;
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

    // UTS
    // menghitung jumlah node pada linked list
    public void jumlahNode(){
        int jumlah = 0;
        if(isEmpty() ==  true){
            System.out.println("Jumlah node : " + jumlah);
        }
        else {
            Node temp = head;
            if(head.next == null){
                jumlah = 1;
                System.out.println("Jumlah node : " + jumlah);
            }
            else{
                jumlah = 1;
                while(temp.next != null){
                    temp = temp.next;
                    jumlah += 1;
                }
                System.out.println("Jumlah node : " + jumlah);
            }
        }
    }

    public static void main(String[] args) {
        SLLNC list = new SLLNC();
        int flag = 0;

        do {
            int data = 0;
            int pilih = Integer.parseInt(JOptionPane.showInputDialog("Pilih perintah: " +
                    "\n1. Insert First" + "\n2. Insert Last\n3. Delete First" +
                    "\n4. Delete Last\n5. Jumlah Node\n6. end"));

            if (pilih == 1 || pilih == 2) {
                data = Integer.parseInt(JOptionPane.showInputDialog("Input data: "));
            }

            switch (pilih) {
                case 1:
                    list.insertFirst(data);
                    break;
                case 2:
                    list.insertLast(data);
                    break;
                case 3:
                    list.deleteFirst();
                    break;
                case 4:
                    list.deletelast();
                    break;
                case 5:
                    list.jumlahNode();
                    break;
                default:
                    flag = 1;
            }
            list.print();
            System.out.println();
        }
        while (flag == 0);
//        while (true) {
//            int flag = 0;
//            int data = 0;
//            int pilih = Integer.parseInt(JOptionPane.showInputDialog("Pilih perintah: " +
//                    "\n1. Insert First" + "\n2. Insert Last\n3. Delete First" +
//                    "\n4. Delete Last\n5. Jumlah Node\n6. end"));
//            if(pilih==1 || pilih==2){
//                data = Integer.parseInt(JOptionPane.showInputDialog("Input data: "));
//            }
//
//            switch (pilih){
//                case 1:
//                    list.insertFirst(data);
//                    break;
//                case 2:
//                    list.insertLast(data);
//                    break;
//                case 3:
//                    list.deleteFirst();
//                    break;
//                case 4:
//                    list.deletelast();
//                    break;
//                case 5:
//                    list.jumlahNode();
//                    break;
//                case 6:
//                    flag = 1;
//            }
//            list.print();
//            System.out.println();
//            if (flag==1){
//                break;
//            }
//        }
    }
}



























