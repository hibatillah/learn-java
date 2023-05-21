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
public class PositifNegatif {
    public static void main(String[] args) {
        int bilangan;
        String ket;

        bilangan = Integer.parseInt(JOptionPane.showInputDialog("input bilangan : "));

        if (bilangan >= 1) {
            System.out.println(bilangan + " adalah bilangan positif");
        } else if (bilangan <= -1) {
            System.out.println(bilangan + " adalah bilangan negatif");
        } else {
            System.out.println("Nol");
        }
        ;
    }

}
