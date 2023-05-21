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
public class Belanja {
    public static void main(String[] args) {
        int c;
        int hc;
        int b;
        double hb;
        double db;
        double total;
        
        c = Integer.parseInt(JOptionPane.showInputDialog("Jumlah celana : "));
        hc = Integer.parseInt(JOptionPane.showInputDialog("Harga celana :  "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Jumlah bunga :  "));
        hb = 75000;
        db = b*hb* 10/100;
      
        total = (c*hc)+((b*hb)-db);
        
        JOptionPane.showMessageDialog(null, "Jumlah celana : "+c+"\nHarga celana : "
                +hc+"\nJumlah bunga : "+b+"\nHarga bunga : "+db+"\n\nTotal belanja = "+total);
    }
    
}
