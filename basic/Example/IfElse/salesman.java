package Example.IfElse;

import java.util.Scanner;

public class salesman {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int hargajual, terjual, jasa, jumlah;
        double komisi;

        System.out.println("Berapa harga barang yang dapat dijual..?");
        hargajual = input.nextInt();
        System.out.println("Berapa banyak barang yang terjual");
        jumlah = input.nextInt();

        terjual = hargajual*jumlah;

        if (hargajual==200){
            jasa = 10;
            komisi = terjual*0.1;
        } else if (hargajual>200 && hargajual<=500){
            jasa = 20;
            komisi = terjual*0.15;
        } else if (hargajual>500){
            jasa = 30;
            komisi = terjual*0.2;
        } else {
            jasa = 0;
            komisi = 0;
        }
        
        if (jasa == 0){
            System.out.println("pernyataan tidak valid");
        } else if (komisi == 0){
            System.out.println("pernyataan tidak valid");
        } else{
        System.out.println("Harga jual barang = "+hargajual+"k rupiah\nJumlah barang terjual = "+jumlah+
        "\nTotal pendapatan hari ini = "+terjual+"k rupiah\nMaka anda mendapatkan upah "+jasa+"k rupiah dan komisi "+
        komisi+"k rupiah");
        }
        
    }
    
}
