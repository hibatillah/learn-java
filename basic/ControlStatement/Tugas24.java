package ControlStatement;

import java.util.Scanner;

public class Tugas24 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String huruf, ket;
        int i = 1;
        
        do {
            System.out.println("input nilai: ");
            double nilai = input.nextDouble();
        
            if (nilai>=1 && nilai<=100){
                ket = "nilai valid";
                if (nilai>80){
                    huruf = "A";
                } else if (nilai>70){
                    huruf = "B";
                } else if (nilai>60){
                    huruf = "C";
                } else{
                    huruf = "F";
                }
            } else{
                ket = "tidak valid";
                huruf = "tidak valid";
            }
        
            if (ket == "tidak valid"){
                System.out.println("nilai tidak valid");
            } else{
                System.out.println("Nilai anda "+nilai+
                    "\nanda mendapatkan "+huruf+"\n");
            }
            i++;
        }
        while (i<=5);
        
        
    }
    
}
