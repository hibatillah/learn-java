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
public class JamMenitDetiksc {
    public static void main(String[] args) {
        int jam;
        int menit;
        int detik;
        int detik2;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Jam: ");
        jam = sc.nextInt();
        System.out.println("Menit: ");
        menit = sc.nextInt();
        detik = jam*3600;
        detik2 = menit*60;
        
        System.out.println(+jam+" jam "+menit+" menit = "+(detik+detik2)+" detik");
        
        
    }
    
}
