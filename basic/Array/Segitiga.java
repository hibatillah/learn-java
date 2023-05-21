package Array;

import javax.swing.JOptionPane;

public class Segitiga {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("jumlah: "));
        
        for(int i=1; i<=n; i++) {
            for(int j=n; j>i; j--) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    
}
