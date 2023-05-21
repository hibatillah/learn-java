/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Looping;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab-284
 */
public class While2 {
    public static void main(String[] args) {
        int jumlah = 0, i=1;
        
        while (i<=3){
            int bil = Integer.parseInt(JOptionPane.showInputDialog("input bilangan ke "+i+" : "));
            System.out.println(bil);
            jumlah += bil;
            i++;
        }
        System.out.println("jumlah : "+jumlah);
        
    }
    
}
