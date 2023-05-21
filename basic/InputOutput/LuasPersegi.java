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
public class LuasPersegi {
    public static void main(String[] args) {
        int sisi;
        double luas;
        
        sisi = Integer.parseInt(JOptionPane.showInputDialog("sisi : "));
        luas = sisi*sisi;
        
        JOptionPane.showMessageDialog(null, "sisi : "+sisi+"\nLuas persegi = "
                +luas+" cm");
        
    }
    
}
