package ControlStatement;

import java.util.Scanner;

public class Tugas26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int tahun;
        int kabisat = 0;

        System.out.println("Berikut tahun kabisat\nantara 1900-2019");

        for (tahun=1900; tahun<=2019; tahun+=4) {
            if (tahun%400==0){
                System.out.println(tahun);
                kabisat += 1;
            }
            else if (tahun%100==0){
                System.out.println(tahun);
                kabisat += 1;
            }
            else if (tahun%4==0){
                System.out.println(tahun);
                kabisat += 1;
            }
            else{

            }
        }
        System.out.println("\nBanyak tahun kabisat\nantara 1900-2019 ada "+kabisat+" kali");

    }
    
}
