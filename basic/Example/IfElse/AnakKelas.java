package Example.IfElse;

import java.util.Scanner;

public class AnakKelas {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int jenis;

        System.out.println("Jenis kelamin anda:\n1. laki\n2. perempuan");
        jenis = input.nextInt();

        if (jenis == 1){
            System.out.println("Karena anda laki-laki, anda harus tetap di kelas dan mengerjakan tugas A");
        } else if(jenis == 2){
            System.out.println("Karena anda perempuan, anda harus keluar dari kelas dan mengerjakan tugas B");
        } else{
            System.out.println("Karena anda bukan keduanya, maka anda dibolehkan pulang");
        }

    }
    
}
