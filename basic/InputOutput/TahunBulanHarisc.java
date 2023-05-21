/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import java.util.Scanner;

/**
 *
 * @author hibat
 */
public class TahunBulanHarisc {
    public static void main(String[] args) {
        int tahun;
        int bulan;
        int hari;
        int hari2;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Tahun: ");
        tahun = sc.nextInt();
        System.out.println("Bulan: ");
        bulan = sc.nextInt();
        
        hari = tahun*365;
        hari2 = bulan*30;
        
        System.out.println(+tahun+" tahun "+bulan+" bulan = "
                +(hari+hari2)+" hari");
        
    }
    
}
