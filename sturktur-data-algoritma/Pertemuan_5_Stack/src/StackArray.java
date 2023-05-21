public class StackArray {
    int max;
    int stackArray[];
    int top;

    public StackArray(int max){
        this.max = max;
        stackArray = new int[max];
        top = -1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == max - 1);
    }

    public boolean push(int data){
        if(isFull() == true){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            stackArray[++top] = data;
            System.out.println(data + " --> push data ke stack");
            return true;
        }
    }

    public int pop(){
        if(isEmpty() == true){
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int data = stackArray[top--];
            return data;
        }
    }

    public int peek(){
        if(isEmpty() == true){
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int data = stackArray[top];
            return data;
        }
    }

    public void print(){
        for (int i = top; i > -1; i--){
            System.out.println(" " + stackArray[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Membuat Struktur Data Stack Array");
        System.out.println("---------------------------------");
        StackArray stack = new StackArray(3);
        System.out.println("Ukuran max stack : " + stack.max);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Top.data : " + stack.peek());
        System.out.println("Isi stack : ");
        stack.print();

        System.out.println("\nPop data stack");
        System.out.println("----------------");
        System.out.println(stack.pop() + "Pop dari stack");
        System.out.println("Isi stack : ");
        stack.print();
    }
}

