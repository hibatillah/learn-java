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
public class LuasSegitigasc {
    public static void main(String[] args) {
        int alas;
        int tinggi;
        int luas;
        
         Scanner sc = new Scanner (System.in);
         
         System.out.println("Alas: ");
         alas = sc.nextInt();
         System.out.println("Tinggi: ");
         tinggi = sc.nextInt();
         luas = (alas*tinggi)/2;
         
         System.out.println("Alas: "+alas+"\nTinggi: "+tinggi+
                 "\nLuas segitiga = "+luas);
         
    }
    
}
