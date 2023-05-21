package PBO.Modul2;
import java.util.Scanner;

public class TestLingkaran1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan jari-jari lingkaran: ");
        double jari_jari = input.nextDouble();

        Lingkaran1 objLing1 = new Lingkaran1(jari_jari);
        Lingkaran1 objLing2 = new Lingkaran1(jari_jari);

        System.out.println("Luas lingkaran : "+String.format("%,.2f", objLing1.luasLingkaran()));
        System.out.println("Luas lingkaran : "+String.format("%,.2f", objLing2.kelilingLingkaran()));
    }
    
}
