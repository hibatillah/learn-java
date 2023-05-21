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
public class BurungBeo {
    public static void main(String[] args) {
        String burung;
        String kata;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("kata yang diucapkan: ");
        kata = sc.next();
        burung = kata;
        
        System.out.println("burung ngomong: "+burung);
    }
    
}
