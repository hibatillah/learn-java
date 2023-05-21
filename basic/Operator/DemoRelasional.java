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
public class DemoRelasional {
    public static void main(String[] args) {
        int i = 37;
        int j = 42;
        int k = 42;
        
        System.out.println("Nilai variabel: ");
        System.out.println("i= "+i);
        System.out.println("j= "+j);
        System.out.println("k= "+k);
        
        System.out.println("\nLebih besar dari: ");
        System.out.println("i > j= "+(i>j));
        System.out.println("j > i= "+(j>i));
        System.out.println("k > j= "+(k>j));
        
        System.out.println("\nLebih besar dari atau sama dengan: ");
        System.out.println("i >= j= "+(i>=j));
        System.out.println("j >= i= "+(j>=i));
        System.out.println("k >= j= "+(k>=j));
        
        System.out.println("\nLebih kecil dari: ");
        System.out.println("i < j= "+(i<j));
        System.out.println("j < i= "+(j<i));
        System.out.println("k < j= "+(k<j));
        
        System.out.println("\nLebih kecil dari atau sama dengan: ");
        System.out.println("i <= j= "+(i<=j));
        System.out.println("j <= i= "+(j<=i));
        System.out.println("k <= j= "+(k<=j));
        
        System.out.println("\nSama dengan kah? : ");
        System.out.println("i == j= "+(i==j));
        System.out.println("j == i= "+(j==i));
        System.out.println("k == j= "+(k==j));
        
        System.out.println("\nTidak sama dengan kah? : ");
        System.out.println("i != j= "+(i!=j));
        System.out.println("j != i= "+(j!=i));
        System.out.println("k != j= "+(k!=j));
    }
    
}
