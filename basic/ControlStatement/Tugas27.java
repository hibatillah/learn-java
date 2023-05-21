package ControlStatement;

import java.util.Scanner;

public class Tugas27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i=1, bil, ganjil=0, genap=0;
        String ket;
        
        do {
            System.out.println("\ninput bilangan: ");
            bil = sc.nextInt();
            
            if (bil%2==0){
                ket = "genap";
                genap += 1;
            } else{
                ket = "ganjil";
                ganjil += 1;
            }
            System.out.println(bil+" adalah bilangan "+ket);
            i++;
        }
        while (i<=10);
        
        System.out.println("\njumlah bilangan genap : "+genap+
        "\njumlah bilangan ganjil : "+ganjil);
    }
    
}
