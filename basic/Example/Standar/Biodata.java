/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example.Standar;

import java.util.Scanner;

/**
 *
 * @author hibat
 */
public class Biodata {
    public static void main(String[] args) {
        String nama;
        int umur;
        int kelas;
        double berat;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Nama: ");
        nama = sc.next();
        System.out.println("Umur: ");
        umur= sc.nextInt();
        System.out.println("Kelas: ");
        kelas = sc.nextInt();
        System.out.println("Berat badan: ");
        berat = sc.nextDouble();
        
        System.out.println("Nama anda "+nama+" kaan..."+
                "\nDan anda berumur "+umur+" tahun"+"\nAnda duduk di kelas "+kelas+
                "\nDan berat badan anda "+berat+" kg"+
                        "\nSekian yang saya ketahui tentang anda, terimakasih..! ");
    }
    
}
