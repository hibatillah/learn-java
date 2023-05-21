package Praktikum_PBO_8;
import java.util.Random;

public class DemoHewan {
    public static void main(String[] args) {
        Hewan[] peliharaanku = {new Burung("Kakak tua"), new Kambing("Etawa"),
            new Anjing("Kintamani"), new Kucing("Anggora")};

        Hewan kesayangan;
        Random pilihan = new Random();  //memilih acak
        kesayangan = peliharaanku[pilihan.nextInt(peliharaanku.length)];
        //mengacak bilangan dari 0 sampai length-1 atau i-1

        System.out.println("Binatang kesayangan anda : " + kesayangan);
        System.out.println("Suaranya : ");
        kesayangan.suara();
    }
    
}
