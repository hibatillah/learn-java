public class LinearQueue {
    int maxsize = 6;
    char antrian [] = new char[maxsize];
    int front = 0;
    int rear = -1;


    public boolean isFull() {
        if(rear == maxsize - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if(rear == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(char item) {
        if(!isFull()) {
            rear ++;
            antrian[rear] = item;
        } else {
            System.out.println("Antrian penuh");
        }
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue kosong/underflow!");
        } else {
            front++;
            if(front==maxsize) {
                System.out.println("Dequeue berhasil, " + antrian[front-1] + " keluar dari queue");
                front = -1;
                rear = -1;
            } else {
                System.out.println("Dequeue berhasil, " + antrian[front-1] + " keluar dari queue");
            }
        }
    }

    public void cetak() {
        if(!isEmpty()) {
            for (int i = front; i <= rear; i++) {
                System.out.print(antrian[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        LinearQueue data = new LinearQueue();
        System.out.println("-----Linear Queue-----");
        System.out.println();
        System.out.println("Percobaan Enqueue-----");
        data.enqueue('M');
        data.enqueue('A');
        data.enqueue('T');
        data.enqueue('T');
        data.enqueue('Y');
        System.out.println("Isi Queue :");
        data.cetak();
        System.out.println();
        System.out.println();
        System.out.println("Percobaan Dequeue-----");
        System.out.println("Isi Queue sebelum dihapus :");
        data.cetak();
        System.out.println();
        System.out.println();
        data.dequeue();
        data.dequeue();
        System.out.println("\nIsi Queue sesudah dihapus :");
        data.cetak();
    }
}
