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
public class CelciusFahreinheitsc {
    public static void main(String[] args) {
        double celcius;
        double fahreinheit;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Celcius: ");
        celcius = sc.nextDouble();
        fahreinheit = (celcius*9/5)+32;
        
        System.out.println(+celcius+" Celcius = "+fahreinheit+" Fahreinheit");
        
    }
    
}
