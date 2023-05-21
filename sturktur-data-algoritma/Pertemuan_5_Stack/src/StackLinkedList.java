public class StackLinkedList {
    StackNode head;

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        else {
            return false;
        }
    }

    public void push(int data){
        StackNode nodeBaru = new StackNode(data);

        if(head == null){
            head = nodeBaru;
        }
        else {
            StackNode temp = head;
            nodeBaru.next = temp;
            head = nodeBaru;
        }
        System.out.println(data + " --> push data ke stack");
    }

    public int pop(){
        int popped = Integer.MIN_VALUE;
        if(isEmpty() == true){
            System.out.println("Stack kosong / underflow");
        }
        else {
            popped = head.data;
            head = head.next;
        }
        return popped;
    }

    public int peek(){
        if(isEmpty() == true){
            System.out.println("Stack Kosong");
            return 0;
        }
        else {
            return head.data;
        }
    }

    public void print(){
        StackNode tail;
        if(isEmpty() == false){
            tail = head;
            while (tail != null){
                System.out.println(tail.data + " ");
                tail = tail.next;
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        System.out.println("Membuat stack menggunakan linked list");
        System.out.println("-------------------------------------");

        StackLinkedList stackLL = new StackLinkedList();

        stackLL.push(10);
        stackLL.push(20);
        stackLL.push(30);
        stackLL.push(40);

        System.out.println(stackLL.pop() + "pop dari stack");
        System.out.println("Top.data : " + stackLL.peek());
        stackLL.print();
    }
}

class StackNode{
    int data;
    StackNode next;

    StackNode(int data){
        this.data = data;
        next = null;
    }
}
