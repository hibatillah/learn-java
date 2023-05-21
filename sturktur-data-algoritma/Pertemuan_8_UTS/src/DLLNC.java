import javax.swing.*;

public class DLLNC {
    public int data;
    public DLLNC next;
    public DLLNC prev;
    DLLNC head;
    DLLNC temp;
    DLLNC tail;

    public DLLNC(){

    }

    public DLLNC(int d){
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
        DLLNC baru;
        baru = new DLLNC(databaru);
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
        DLLNC baru;
        baru = new DLLNC(databaru);
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
        DLLNC hapus;
        hapus = head;

        if(head.next != null){
            head = head.next;
            head.prev = null;
            hapus = null;
        }
    }

    public void deleteLast(){
        DLLNC hapus;
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
        DLLNC temp2;
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
            temp = head;
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

    // UTS
    // Insert sebelum node tertentu
    public void insertBefore(int databaru, int before){
        DLLNC baru;
        baru = new DLLNC(databaru);
        baru.next = null;
        baru.prev = null;

        if(isEmpty() == true){
            head = baru;
            head.next = null;
            head.prev = null;
        }
        else{
            if(head.next == null){
                baru.next = head;
                baru.prev = null;
                head.prev = baru;
                head = baru;
            }
            else {
                DLLNC temp = head;
                int flag = 0;
                while (temp != null) {
                    if (temp.data == before) {
                        DLLNC temp2 = temp.prev;
                        baru.next = temp;
                        baru.prev = temp2;
                        temp2.next = baru;
                        temp.prev = baru;
                        flag = 1;
                        break;
                    }
                    temp = temp.next;
                }
                if (flag == 0) {
                    System.out.print("Node Tidak Ditemukan");
                }
            }
        }
    }


    public static void main(String[] args) {
        DLLNC link = new DLLNC();
        int flag = 0;

        do {
            int data = 0;
            int dicari = 0;
            int pilih = Integer.parseInt(JOptionPane.showInputDialog("Pilih perintah: " +
                    "\n1. Insert First" + "\n2. Insert Last\n3. Delete First" +
                    "\n4. Delete Last\n5. Insert Before\n6. end"));

            if(pilih==1 || pilih==2){
            }
            else if (pilih==5){
                data = Integer.parseInt(JOptionPane.showInputDialog("Input data: "));
            }

            switch (pilih){
                case 1:
                    link.insertFirst(data);
                    break;
                case 2:
                    link.insertLast(data);
                    break;
                case 3:
                    link.deleteFirst();
                    break;
                case 4:
                    link.deleteLast();
                    break;
                case 5:
                    link.insertBefore(data, dicari);
                    break;
                default:
                    flag = 1;
            }
            link.printFirst();
            System.out.println();
        }
        while (flag == 0);

    }
}






















