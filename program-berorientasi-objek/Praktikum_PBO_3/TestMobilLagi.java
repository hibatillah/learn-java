package Praktikum_PBO_3;

public class TestMobilLagi {
    public static void main(String[] args) {
        MobilLagi m1 = new MobilLagi();
        MobilLagi m2 = new MobilLagi();

        m1.setMerek("Toyota");
        m1.setWarna("Hitam");

        m2.setMerek("Kijang");
        m2.setWarna("Merah");

        m1.beriWarna();
        System.out.println();
        m2.beriWarna();


    }
    
}
