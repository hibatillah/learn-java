/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import javax.swing.JOptionPane;

/**
 *
 * @author 284-PC13
 */
public class LuasLingkaran {
    public static void main(String[] args) {
        int jari;
        double phi;
        double luas;
        
        jari = Integer.parseInt(JOptionPane.showInputDialog("jari-jari lingkaran: "));
        phi = 3.14;
        luas = phi*jari*jari;
        
        JOptionPane.showMessageDialog(null, "jari lingkaran : "+jari+
                "\nLuas Lingkaran = "+luas);
        
                
    }
    
}
