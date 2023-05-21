
package Looping;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab-284
 */
public class While {
    public static void main(String[] args) {
        int i = 1;
        
        while (i<=3){
            String kata = JOptionPane.showInputDialog("input kata ke "+i+" : ");
            System.out.println(kata);
            i++;
        }
        
        
    }
    
}