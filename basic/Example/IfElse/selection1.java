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
public class selection1 {
    public static void main(String[] args) {
        int bil1;
        int bil2;
        
        bil1= Integer.parseInt(JOptionPane.showInputDialog("bilangan 1"));
        bil2 = Integer.parseInt(JOptionPane.showInputDialog("bilangan 2 "));
        
        if(bil1>bil2) {
            System.out.println(bil1+" adalah bilangan yang lebih besar");
        }
        else {
            System.out.println(bil2+" adalah bilangan yang lebih besar");
        }
    }
    
}
