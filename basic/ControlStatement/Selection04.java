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
public class Selection04 {
    public static void main(String[] args) {
        String nama, ket;
        int nilai;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nama anda : ");
        nama = sc.next();
        System.out.println("Nilai " + nama + " :");
        nilai = sc.nextInt();

        if (nilai > 0) {
            if (nilai > 80) {
                ket = "Nilai sempurna";
            } else if (nilai > 60) {
                ket = " NIlai cukup";
            } else {
                ket = "Nilai gagal";
            }
        } else {
            ket = "nilai tidak valid";
        }
        System.out.println("Keterangan : " + ket);
    }

}
