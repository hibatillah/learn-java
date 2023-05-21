import java.io.*;
public class PriorityQApp {

    public static void main(String[] args)
            throws IOException {
        PriorityQ thePQ = new PriorityQ(5);
        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);

        while (!thePQ.isEmpty()) {
            double item = thePQ.remove();
            System.out.println(item + " "); }
        System.out.println("");
    }
}