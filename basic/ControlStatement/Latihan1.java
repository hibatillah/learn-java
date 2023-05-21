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
public class Latihan1 {
    public static void main(String[] args) {
        int tinggi;
        String ket;

        Scanner sc = new Scanner(System.in);

        System.out.println("Tinggi anda : ");
        tinggi = sc.nextInt();

        if (tinggi >= 160) {
            ket = "tinggi";
        } else {
            ket = "pendek";
        }
        System.out.println("Tinggi anda " + tinggi + " cm, maka anda " + ket);
    }

}
