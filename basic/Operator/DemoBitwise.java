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
public class DemoBitwise {
    public static void main(String[] args) {
        int a = 5;
        int b = 11;
        int c = 4;
        
        System.out.println("Nilai variabel: ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        
        a = a&b;
        b = b|c;
        c = c^b;
        
        System.out.println("\nSetelah bit dicek: ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        
    }
    
}
