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
public class Soal1 {
    public static void main(String[] args) {
        int jumlah, harga;

        jumlah = Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli : "));

        if (jumlah >= 1) {
            if (jumlah < 100) {
                harga = jumlah * 10000;
            } else if (jumlah >= 100 && jumlah < 150) {
                harga = jumlah * 9500;
            } else {
                harga = jumlah * 9000;
            }
        } else {
            harga = jumlah * 0;
        }

        System.out.println("Jumlah barang yang dibeli ada " + jumlah + " buah," +
                "\nTotal harganya ialah " + harga + " rupiah");

    }

}
