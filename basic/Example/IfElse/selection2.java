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
public class selection2 {
    public static void main(String[] args) {
        int bilangan;
        
        bilangan = Integer.parseInt(JOptionPane.showInputDialog("bilangan : "));
        
        if (1<=bilangan && bilangan<=10) {
            System.out.println(bilangan+ " merupakan bilangan valid");
        } else {
            System.out.println(bilangan + " merupakan bilangan tidak valid");
        }    
    }
    
}
