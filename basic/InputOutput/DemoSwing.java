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
public class DemoSwing {
    
    public static void main(String[] args) {
        
        String nama;
        int usia;
        
        nama = JOptionPane.showInputDialog("Nama anda: ");
        usia = Integer.parseInt(JOptionPane.showInputDialog("Usia anda: "));
        
        JOptionPane.showMessageDialog(null, "Haloo "+nama+","+"\nusia anda: "
                +usia+" tahun");
        
    }
}
