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
public class DemoKondisional {
    public static void main(String[] args) {
        int a = 7;
        int b = 10;
        int c = 10;
        
        System.out.println("Penggunaan AND: ");
        System.out.println("(a > b) && (b < c) = "+((a>b)&&(b<c)));
        System.out.println("(a < b) && (b != c) = "+((a<b)&&(b!=c)));
        System.out.println("(a == b) && (b >= c) = "+((a==b)&&(b>=c)));
        
        System.out.println("\nPenggunaan OR: ");
        System.out.println("(a > b) || (b < c) = "+((a>b)||(b<c)));
        System.out.println("(a < b) || (b != c) = "+((a<b)||(b!=c)));
        System.out.println("(a == b) || (b >= c) = "+((a==b)||(b>=c)));
        
        System.out.println("Penggunaan Negasi: ");
        System.out.println("!((a > b) && (b < c)) = "+!((a>b)&&(b<c)));
        System.out.println("(a < b) && !(b != c) = "+((a<b)&&!(b!=c)));
        System.out.println("!(a == b) && (b >= c) = "+(!(a==b)&&(b>=c)));
        
    }
    
}
