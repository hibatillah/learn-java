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
public class Selection01 {
    public static void main(String[] args) {
        String nama;
        int nilai = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nama anda : ");
        nama = sc.next();
        System.out.println("Nilai " + nama + " : ");
        nilai = sc.nextInt();

        if (nilai > 60) {
            System.out.println("Lulus");

        }
    }
}
