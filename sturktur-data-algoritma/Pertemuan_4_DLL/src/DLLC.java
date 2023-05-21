public class DLLC {
    link head;
    link temp;
    link tail;

    public boolean isEmpty(){
        if(head == null){
            return true;
        } else{
            return false;
        }
    }

    public void insertFirst(int databaru){
        link baru;
        baru = new link(databaru);
        baru.next = baru;
        baru.prev = baru;

        if(isEmpty() == true){
            head = baru;
            head.next = head;
            head.prev = head;
        } else{
            temp = head.prev;
            head.prev = baru;
            baru.next = head;
            head = baru;
            temp.next = head;
            head.prev = temp;
        }
    }

    public void insertLast(int databaru){
        link baru;
        baru = new link(databaru);
        baru.next = baru;
        baru.prev = baru;

        if(isEmpty()){
            head = baru;
            head.next = head;
            head.prev = head;

        }
        else{
            tail = head.prev;
            tail.next = baru;
            baru.prev = tail;
            baru.next = head;
            head.prev = baru;
        }
    }

    public void deletefirst(){
        link hapus;
        hapus = head;

        if (head.next != head){
            temp = head.prev;
            head = head.next;
            temp.next = head;
            head.prev = temp;
            hapus = null;
        } else {
            head = null;
        }
    }

    public void deleteLast(){
        link hapus;
        hapus = head;

        if(isEmpty()){
            System.out.println("linked list koosng");
        }
        else if (head.next==head){
            head = null;
        }
        else{
            tail = head.prev;
            temp = tail.prev;
            tail = null;
            temp.next = head;
            head.prev = temp;
        }
    }

    public void printFirst(){
        if(isEmpty() == false){
            temp = head;
            do{
                temp.displaynode();
                temp = temp.next;
            } while(temp != head);
        }
    }

    public void printLast(){
        link temp2;
        if(isEmpty() == false){
            temp = head;
            while (temp.next != head){
                temp = temp.next;
            }
            temp2 = temp;

            do{
                temp2.displaynode();
                temp2 = temp2.prev;
            } while(temp2.prev != temp);
            temp2.displaynode();
        }
    }

    public void search(int cari){
        int flag = 0;
        if(head==null)
            System.out.println("linked list Kosong");
        else{
            temp = head;
            while(true){
                if(temp.data == cari){
                    System.out.println("Data Ditemukan");
                    flag = 1;
                    break;
                }
                temp = temp.next;
            }
            if(flag==0) {
                System.out.println("Data Tidak Ditemukan");
            }
        }
    }

    public static void main(String[] args) {
        DLLC link = new DLLC();
        link.insertFirst(5);
        link.insertFirst(2);
        link.insertFirst(7);
        link.insertLast(9);
        link.printFirst();
        System.out.println();
//
//       link.insertFirst(6);
//        link.printLast();
//        link.deletefirst();
//        System.out.println();
//
//        link.printFirst();
//        link.deleteLast();
//        System.out.println();
//        link.printFirst();
//        System.out.println();

        link.search(5);
    }

}
