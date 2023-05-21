package Praktikum_PBO_3;
import Another_Praktikum_PBO_3.LingkaranLagi;
import java.util.Scanner;

public class TestLingkaran1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LingkaranLagi obj = new LingkaranLagi();

        System.out.println("Masukkan nilai jari-jari: ");
        double jari = input.nextDouble();
        obj.setJari_jari(jari);

        System.out.println("Luas Lingkaran: "+obj.luasLingkaran());
        System.out.println("Keliling Lingkaran: "+obj.kelLingkaran());
    }
    
}
