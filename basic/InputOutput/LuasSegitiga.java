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
public class LuasSegitiga {
    public static void main(String[] args) {
        int alas;
        int tinggi;
        double luas;
        
        alas = Integer.parseInt(JOptionPane.showInputDialog("Alas segitiga: "));
        tinggi = Integer.parseInt(JOptionPane.showInputDialog("Tinggi segitiga: "));
        luas = (alas*tinggi)/2;
        
        JOptionPane.showMessageDialog(null, "Alas segitiga: "+alas+" \nTinggi segitiga: "
                +tinggi+"\nLuas segitiga = "+luas+" cm");
        
    }
    
}
