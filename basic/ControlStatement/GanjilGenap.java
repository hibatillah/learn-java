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
public class GanjilGenap {
    public static void main(String[] args) {
        int bilangan;
        String ket;

        Scanner sc = new Scanner (System.in);
        System.out.println("input bilangan: ");
        bilangan = sc.nextInt();
        
        if (bilangan % 2 == 0) {
            ket = "Genap";
        } else {
            ket = "Ganjil";
        }
        System.out.println(bilangan + " adalah bilangan " + ket);
    }

}
