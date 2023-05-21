/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import java.util.Scanner;

/**
 *
 * @author 284-PC13
 */
public class DemoScanner {
    public static void main(String[] args) {
        String nama;
        int usia;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Nama: ");
        nama = sc.next();
        System.out.println("Usia: ");
        usia = sc.nextInt();
        
        System.out.println("Hai "+nama+", usia kamu "+usia+" tahun kaan");
        
    }
    
}
