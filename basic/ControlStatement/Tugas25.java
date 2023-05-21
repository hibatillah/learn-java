package ControlStatement;

import java.util.Scanner;

public class Tugas25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name, nama = "budi";
        int ket, pass, password = 1234;
        
        do {
            System.out.println("Nama : ");
            name = sc.next();
            System.out.println("Password : ");
            pass = sc.nextInt();
        
            //meniru persis
            if (name.equals(nama) && pass==password){   
                ket = 1;
            } else{
                ket = 0;
            }
        
            if (ket==0){
                System.out.println("login gagal..\n");
            } else{
                System.out.println("login sukses!!");
            }
            
        }
        while (ket==0);
        
        
    }
    
}
