package ControlStatement;

import java.util.Scanner;

public class Tugas21 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i = 1;
        
        do{
            System.out.println("input tahun: ");
            int tahun = input.nextInt();
        
            if (tahun%400==0){
                System.out.println(tahun+" adalah tahun kabisat");
            }
            else if (tahun%4==0){
                System.out.println(tahun+" adalah tahun kabisat");
            }
            else {
                System.out.println(tahun+" bukan tahun kabisat");
            }
            i++;
        }
        while (i<=5);
        
    }
    
}
