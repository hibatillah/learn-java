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
public class DemoAritmatika {
    public static void main(String[] args) {
        short aShort = 20;
        int anInteger = 401;
        long aLong = 450L;
        float aFloat = 90;
        
        System.out.println("aLong = "+aLong);
        System.out.println("anInteger = "+anInteger);
        long otherLong = aLong + anInteger;
        System.out.println("otherLong = "+otherLong);
        
        System.out.println("\naFloat ="+aFloat);
        System.out.println("aShort = "+aShort);
        float otherFloat = aFloat / aShort;
        System.out.println("otherFloat = "+otherFloat);
        
        System.out.println("\nanInteger = "+anInteger);
        anInteger = anInteger / 4;
        System.out.println("anInteger = "+anInteger);
        int x = anInteger++;
        System.out.println("\nanInteger = "+anInteger);
        System.out.println("x = "+x);
        
        x = ++anInteger;
        
        System.out.println("\nanInteger = "+anInteger);
        System.out.println("x = "+x);
                
    }
    
}
