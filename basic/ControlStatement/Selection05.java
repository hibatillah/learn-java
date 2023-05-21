/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlStatement;

import java.util.Scanner;

/**
 *
 * @author Lab-284
 */
public class Selection05 {
    public static void main(String[] args) {
        int pil;
        String ket;

        Scanner sc = new Scanner(System.in);

        System.out.println("Pilihan: \n1.SI\n2.TI");

        System.out.print("Pilihan anda: ");
        pil = sc.nextInt();

        switch (pil) {
            case 1:
                ket = "anda memilih SI";
                break;
            case 2:
                ket = "anda memilih TI";
                break;
            default:
                ket = "cek pilihan anda";
                break;
        }
        System.out.println("Keterangan : " + ket);
    }
}