import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PostfixEvaluate {
    private Stacke theStackee;
    private String input;

    public PostfixEvaluate(String s){
        input = s;
    }

    public int doParse(){
        theStackee = new Stacke(input.length());
        char ch;
        int j;
        int num1, num2, interAns = 0;

        for (j = 0; j< input.length(); j++){
            ch = input.charAt(j);
            theStackee.displayStack("" + ch + " ");

            if (ch >= '0' && ch <= '9'){
                theStackee.push((int) (ch - '0'));
            } else {
                num2 = theStackee.pop();
                num1 = theStackee.pop();

                switch (ch){
                    case '+':
                        interAns = num1 + num2;
                        break;
                    case '-':
                        interAns = num1 - num2;
                        break;
                    case '*':
                        interAns = num1 * num2;
                        break;
                    case '/':
                        interAns = num1 / num2;
                        break;
                    default:
                        interAns = 0;
                }
                theStackee.push(interAns);
            }
        }
        interAns = theStackee.pop();
        return interAns;
    }
}

class Stacke{
    private int maxSize;
    private int[] stack;
    private int top;

    public Stacke(int a){
        maxSize = a;
        stack = new int[maxSize];
        top = -1;
    }

    public void  push(int b){
        stack[++top] =b;
    }

    public int pop(){
        return stack[top--];
    }

    public double peek(){
        return stack[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }

    public int size(){
        return top + 1;
    }

    public int peekN(int n){
        return stack[n];
    }

    public void displayStack(String s){
        System.out.println("karakter yang dibaca: " + s);
        System.out.print("isi stack ");
        for (int j = 0; j < size(); j++){
            System.out.print(peekN(j));
            System.out.print(' ');
        }
        System.out.println("");
    }

}

class app{
    public static void main(String[] args) throws IOException{
        System.out.println("Enter postfix ");
        System.out.flush();
        String input = getString();

        System.out.println("");
        PostfixEvaluate eval = new PostfixEvaluate(input);
        int output = eval.doParse();
        System.out.println("Hasil evaluasi = " + output);
    }

    public static String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
