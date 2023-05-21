import javax.swing.*;

public class Stack {
    int max;
    String stackArray[];
    int top;

    public Stack(int max){
        this.max = max;
        stackArray = new String[max];
        top = -1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == max - 1);
    }

    public boolean push(String data){
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

    public String pop(){
        if(isEmpty() == true){
            System.out.println("Stack Underflow");
            return null;
        }
        else {
            String data = stackArray[top--];
            return data;
        }
    }

    public String peek(){
        if(isEmpty() == true){
            System.out.println("Stack Underflow");
            return null;
        }
        else {
            String data = stackArray[top];
            return data;
        }
    }

    public void print(){
        for (int i = top; i > -1; i--){
            System.out.print(" " + stackArray[i]);
        }
    }

    public void printReverse(){
        for (int i = 0; i <= top; i++){
            System.out.print(" " + stackArray[i]);
        }
    }

    public static void main(String[] args) {
        int max = Integer.parseInt(JOptionPane.showInputDialog("max stack: "));
        Stack list = new Stack(max);
        int flag = 0;

        do {
            String data = null;
            int pilih = Integer.parseInt(JOptionPane.showInputDialog("Ukuran max stack : " + list.max +
                    "\nPilih perintah: \n1. Push" + "\n2. Pop\n3. Peek\n4. end"));

            switch (pilih){
                case 1:
                    data = JOptionPane.showInputDialog("Input data: ");
                    list.push(data);
                    break;
                case 2:
                    list.pop();
                    break;
                case 3:
                    list.peek();
                    break;
                default:
                    flag = 1;
            }
            list.print();
            System.out.println();
        }
        while(flag == 0);

    }
}
