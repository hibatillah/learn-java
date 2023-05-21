package Example.IfElse;

import java.util.Scanner;

public class photocopy {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int nama, jumlah, harga, hargaawal, total;

        System.out.println("Selamat datang di fotocopy grafity..!\napakah anda pelanggan.??"
        +"\n1. ya\n2. tidak");
        nama = input.nextInt();
        System.out.println("Berapa lembar yang ingin anda fotokopy..?");
        jumlah = input.nextInt();

        
        if (nama == 1){
            harga = 75;
        } else if(nama ==2){
            if (jumlah<100){
                harga = 150;
            } else if (jumlah>=100 && jumlah<=200){
                harga = 100;
            } else if (jumlah>200){
                harga = 80;
            } else{
                harga = 0;
            }
        } else{
            harga = 0;
        }
        total = jumlah*harga;

        if (harga == 0){
            System.out.println("pernyataan tidak valid");
        } else {
        System.out.println("Anda fotocopy "+jumlah + " lembar\ndengan harga "+harga+" perlembar"+
        "\nmaka totalnya adalah "+total);
        }

    }
    
}
