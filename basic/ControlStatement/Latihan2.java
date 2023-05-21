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
public class Latihan2 {
    public static void main(String[] args) {
        String ket, ket2;
        int nilai;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nilai anda : ");
        nilai = sc.nextInt();

        if (nilai >= 81) {
            ket = "A";
            ket2 = "Lulus";
        } else if (nilai >= 78) {
            ket = "AB";
            ket2 = "Lulus";
        } else if (nilai >= 66) {
            ket = "B";
            ket2 = "Lulus";
        } else if (nilai >= 55) {
            ket = "C";
            ket2 = "Lulus";
        } else {
            ket = "F";
            ket2 = "Tidak Lulus";
        }

        System.out.println("Nilai anda " + nilai + ", dan anda mendapatkan " + ket +
                "\nmaka anda dinyatakan " + ket2);
    }

}
