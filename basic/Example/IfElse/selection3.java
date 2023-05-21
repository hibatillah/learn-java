/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example.IfElse;

import javax.swing.JOptionPane;

/**
 *
 * @author hibat
 */
public class selection3 {
    public static void main(String[] args) {
        int bil1, bil2, bil3, bilx;
        int ket;
        
        bil1 = Integer.parseInt(JOptionPane.showInputDialog("bilangan 1 : "));
        bil2 = Integer.parseInt(JOptionPane.showInputDialog("bilangan 2 : "));
        bil3 = Integer.parseInt(JOptionPane.showInputDialog("bilangan 3 : "));
        
        if (bil1>bil2 && bil1>bil3) {
            ket = bil1;
        } else if (bil2>bil3) {
            ket = bil2;
        } else {
            ket = bil3;
        }
        
        System.out.println("Bilangan yang terbesar adalah "+ket);
    }
    
}
