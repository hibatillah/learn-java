package ControlStatement;

import java.util.Scanner;

public class Tugas22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int bilangan,i = 1;
        String ket;
        
        do{
            System.out.println("input bilangan: ");
            bilangan = sc.nextInt();
        
            if (bilangan%2 == 0){
                ket = "Genap";
            } else{
                ket = "Ganjil";
            }
            System.out.println(bilangan+" adalah bilangan "+ket);
            i++;
        }
        while (i<=5);
    }
    
}
