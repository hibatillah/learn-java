/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operator;

/**
 *
 * @author 284-PC13
 */
public class DemoPenugasan {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 10;
        
        System.out.println("Nilai variabel: ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        
        a += b;
        b *= c;
        c &= 7;
        
        System.out.println("\nSetelah penugasan: ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        
    }
    
}
