package Example.IfElse;

import java.util.Scanner;

public class bangun {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int panjang, lebar,luas;
        double jari, phi, luaslingkar;

        System.out.println("Pilihan ruang bangun:\n1\n2");
        System.out.println("Pilihan anda: ");
        int pilihan = sc.nextInt();

        if(pilihan == 1){
            System.out.println("\npanjang persegi: ");
            panjang = sc.nextInt();
            System.out.println("lebar persegi: ");
            lebar = sc.nextInt();
            luas = panjang*lebar;

            System.out.println("Dengan panjang "+panjang+" cm, dan lebar "+lebar+
            " cm\nmaka luas persegi adalah "+luas);
        } else if (pilihan == 2){
            System.out.println("\njari-jari lingkaran: ");
            jari = sc.nextDouble();
            phi = 3.14;
            luaslingkar = phi*(Math.pow(jari, 2));
            
            System.out.println("Dengan jari-jari "+jari+
            "cm, dan phi 3.14\nmaka luas lingkaran adalah "+luaslingkar);
        } else {
            System.out.println("kode tidak valid\ntidak ada bangun ruang");
        }

    }
    
}
