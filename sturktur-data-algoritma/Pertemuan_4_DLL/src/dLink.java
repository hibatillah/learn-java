public class dLink {
    public int data;
    public dLink next;
    public dLink prev;
    dLink head;
    dLink temp;
    dLink tail;

    public dLink(){

    }

    public dLink(int d){
        data = d;
        next = null;
        prev = null;
    }

    public boolean isEmpty(){
        if(head==null){
            return true;
        } else{
            return false;
        }
    }

    public void insertFirst(int databaru){
        dLink baru;
        baru = new dLink(databaru);
        baru.next = null;
        baru.prev = null;

        if(isEmpty()== true){
            head = baru;
            head.next = null;
            head.prev = null;
        } else{
            head.prev = baru;
            baru.next = head;
            head = baru;
        }
    }

    public void insertLast(int databaru){
        dLink baru;
        baru = new dLink(databaru);
        baru.next = null;
        baru.prev = null;

        if(isEmpty() == true){
            head = baru;
            head.next = null;
            head.prev = null;
        }
        else{
            tail = head;
            while(tail.next != null){
                tail = tail.next;
            }
            tail.next = baru;
            baru.prev = tail;
            baru.next = null;
        }
    }

    public void deleteFirst(){
        dLink hapus;
        hapus = head;

        if(head.next != null){
            head = head.next;
            head.prev = null;
            hapus = null;
        }
    }

    public void deleteLast(){
        dLink hapus;
        hapus = head;

        if(isEmpty()){
            System.out.println("linked list kosong");
        }
        else if (head.next==null){
            head = null;
        }
        else{
            while(hapus.next != null){
                hapus = hapus.next;
            }
            temp = hapus.prev;
            hapus = null;
            temp.next = hapus;
        }
    }

    public void printFirst(){
        if (isEmpty() == false){
            temp = head;
            while(temp != null){
                temp.displaynode();
                temp = temp.next;
            }
        }
    }

    public void printLast(){
        dLink temp2;
        if(isEmpty() == false){
            temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp2 = temp;
            while(temp2 != null){
                temp2.displaynode();
                temp2 = temp2.prev;
            }
        }
    }

    public void search(int cari){
        int flag = 0;
        if(head==null)
            System.out.println("LL Kosong");
        else{
            dLink temp = head;
            while(temp != null){
                if(temp.data == cari){
                    System.out.println("Data Ditemukan");
                    flag = 1;
                    break;
                }
                temp = temp.next;
            }
            if(flag==0)
                System.out.println("Data Tidak Ditemukan");
        }
    }

    public void displaynode(){
        System.out.print(data + " ");
    }

}





