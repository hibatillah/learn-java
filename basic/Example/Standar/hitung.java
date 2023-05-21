/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example.Standar;

import javax.swing.JOptionPane;

/**
 *
 * @author hibat
 */
public class hitung {
    public static void main(String[] args) {
        double r;
        double a;
        double b;
        double c;
        double d;
        double hasil;
        
        r = Double.parseDouble(JOptionPane.showInputDialog("r = "));
        a = Double.parseDouble(JOptionPane.showInputDialog("a = "));
        b = Double.parseDouble(JOptionPane.showInputDialog("b = "));
        c = Double.parseDouble(JOptionPane.showInputDialog("c = "));
        d = Double.parseDouble(JOptionPane.showInputDialog("d = "));
        hasil = (4/3*(r+34))-(9*(a+b*c))+((3+d*(2+a))/(a+b*d));
        
        JOptionPane.showMessageDialog(null,"r = "+r+"\na = "+a+"\nb = "+b+"\nc = "+c+"\nd = "+d+"\nhasilnya = "+hasil);
        
       
    }
    
}
