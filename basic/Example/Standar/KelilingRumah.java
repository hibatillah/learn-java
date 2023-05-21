/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example.Standar;

import javax.swing.JOptionPane;


/**
 *
 * @author 284-PC13
 */
public class KelilingRumah {
    public static void main(String[] args) {
        int p;
        int l;
        int k; 
        
        p = Integer.parseInt(JOptionPane.showInputDialog("Panjang rumah : "));
        l = Integer.parseInt(JOptionPane.showInputDialog("Lebar rumah : "));
        k = 2*p + 2*l;
        
        JOptionPane.showMessageDialog(null, "Panjang rumah : "+p+" m"+
                "\nLebar rumah : "+l+" m"+"\n\nKeliling rumah = "+k+" m2");
    }
    
}
