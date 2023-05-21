
package Looping;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab-284
 */
public class For {
    public static void main(String[] args) {
        int n, bebek, jumlah=0;
        n = Integer.parseInt(JOptionPane.showInputDialog("jumlah kandang : "));
        System.out.println("jumlah kandang : "+n+"\n");
        
        for (int i=1; i<=n; i++){
            bebek = Integer.parseInt(JOptionPane.showInputDialog("jumlah bebek kandang "+i+" : "));
            System.out.println("bebek kandang "+i+" : "+bebek);
            jumlah += bebek;
        }
        System.out.println("\nTotal bebek ada : "+jumlah);
    }
    
}
