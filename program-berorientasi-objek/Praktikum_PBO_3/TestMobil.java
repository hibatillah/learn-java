package Praktikum_PBO_3;
import Another_Praktikum_PBO_3.Mobil;

public class TestMobil extends Mobil{
    public static void main(String[] args) {
        TestMobil m1 = new TestMobil();
        TestMobil m2 = new TestMobil();

        m1.merek = "Toyota";
        m1.warna = "Hitam";

        m1.beriMerek();
        m1.beriWarna();
    }
    
}
