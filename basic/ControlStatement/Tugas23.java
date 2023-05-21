package ControlStatement;

import java.util.Scanner;

public class Tugas23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String ket;
        int bil, i=1;
        
        do{
            System.out.println("input bilangan: ");
            bil = sc.nextInt();
            
            if (bil>=1 && bil<=10){
                System.out.println(bil+" merupakan bilangan valid");
            } else{
                System.out.println(bil+" merupakan bilangan tidak valid");
            }
            i++;
        }
        while(i<=5);
        
    }
    
}
