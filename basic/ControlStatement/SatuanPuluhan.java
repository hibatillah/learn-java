/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlStatement;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab-284
 */
public class SatuanPuluhan {
    public static void main(String[] args) {
        int bilangan;
        String ket;

        bilangan = Integer.parseInt(JOptionPane.showInputDialog("input bilangan : "));

        if (bilangan >= 1 && bilangan < 10) {
            System.out.println(bilangan + " adalah satuan");
        } else if (bilangan >= 10 && bilangan < 100) {
            System.out.println(bilangan + " adalah puluhan");
        } else if (bilangan >= 100 && bilangan < 1000) {
            System.out.println(bilangan + " adalah ratusan");
        } else if (bilangan >= 1000 && bilangan < 10000) {
            System.out.println(bilangan + " adalah ribuan");
        } else if (bilangan >= 10000 && bilangan < 100000) {
            System.out.println(bilangan + " adalah puluhanribuan");
        } else {
            System.out.println("bilangan tidak valid");
        }
    }

}
