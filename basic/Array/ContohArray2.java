package Array;

import javax.swing.JOptionPane;
// print reverse
public class ContohArray2 {
    public static void main(String[] args) {
        int bil[] = new int[3];
        
        for (int i=0; i<bil.length; i++){
            bil[i] = Integer.parseInt(JOptionPane.showInputDialog("input bilangan: "));
            System.out.println(bil[i]);
        }
        System.out.println("-----");
        for (int i=2; i>=0; i--){
            System.out.println(bil[i]);
        }
    }
    
}
