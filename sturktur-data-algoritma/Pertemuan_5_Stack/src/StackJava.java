import  java.util.Stack;

public class StackJava {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Stack<Integer> stack1 = new Stack<Integer>();

        stack1.push(77);
        stack1.push(0);
        stack1.push(3);

        System.out.println(stack1.empty());

        System.out.println(stack1);

        int x = stack1.pop();

        System.out.println(x);

        System.out.println(stack1);
    }
}
