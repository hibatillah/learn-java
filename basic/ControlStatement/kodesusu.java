
package ControlStatement;

import java.util.Scanner;

public class kodesusu {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int harga, jumlah, belanja, pembeli;
        int i = 1;
        String susu, ukuran;
        char kode,kode2;
        double pajak, total, diskon;

        System.out.println("banyak pembeli: ");
        pembeli = input.nextInt();
        
        do {
            System.out.println("\nTOKO SUSU\nKode susu"+
            "\tKode ukuran\n1\t\tS\n2\t\tM\n3\t\tL");
            System.out.println("Pilihan kode susu anda: ");
            kode = input.next().charAt(0);
            System.out.println("Pilihan kode ukuran anda: ");
            kode2 = input.next().charAt(0);
            System.out.println("Berapa banyak anda beli: ");
            jumlah = input.nextInt();

            if (kode=='1') {
                susu = "Indomilk";
                if (kode=='1') {
                    if (kode2=='S') {
                        ukuran = "Small";
                        harga = 5000;
                    } else if (kode2=='M') {
                        ukuran = "Medium";
                        harga = 7500;
                    } else if (kode2=='L') {
                        ukuran = "Large";
                        harga = 9500;
                    } else {
                        ukuran = "tidak valid";
                        harga = 0;
                    }
                } else{
                    ukuran = "tidak valid";
                    harga = 0;
                }
            } else if (kode=='2') {
                susu = "Dancow";
                if (kode=='2') {
                    if (kode2=='S') {
                        ukuran = "Small";
                        harga = 4500;
                    } else if (kode2=='M') {
                        ukuran = "Medium";
                        harga = 6500;
                    } else if (kode2=='L') {
                        ukuran = "Large";
                        harga = 8500;
                    } else {
                        ukuran = "tidak valid";
                        harga = 0;
                    }
                } else{
                    ukuran = "tidak valid";
                    harga = 0;
                }
            } else if (kode=='3') {
                susu = "Sustagen";
                if (kode=='3') {
                    if (kode2=='S') {
                        ukuran = "Small";
                        harga = 9500;
                    } else if (kode2=='M') {
                        ukuran = "Medium";
                        harga = 15500;
                    } else if (kode2=='L') {
                        ukuran = "Large";
                        harga = 19500;
                    } else {
                        ukuran = "tidak valid";
                        harga = 0;
                    }
                } else{
                    ukuran = "tidak valid";
                    harga = 0;
                }
            } else {
                susu = "tidak valid";
                ukuran = "tidak valid";
                harga = 0;
            }

            belanja = jumlah*harga;
            pajak = 0.1*belanja;

            if (jumlah>25) {
                diskon = belanja*0.05;
            } else {
                diskon = 0;
            }
            
            total = belanja+pajak-diskon;

            if (susu == "tidak valid"){
                System.out.println("kode tidak valid!!");
            } else if (ukuran == "tidak valid"){
                System.out.println("kode tidak valid!!");
            } else{
                System.out.println("\nAnda memilih kode "+kode+" dan "+kode2+
                "\nanda mendapatkan susu "+susu+"\ndengan ukuran "+ukuran+
                ",\nseharga "+harga+" rupiah perbuah\nanda membeli sebanyak "+
                jumlah+" buah\ndengan pajak 10%,\nmaka total belanja anda adalah "
                +total+" rupiah");
            }
            i++;
        }
        while (i<=pembeli);   
  
    }

}
