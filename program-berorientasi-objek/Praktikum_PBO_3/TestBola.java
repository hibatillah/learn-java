package Praktikum_PBO_3;

public class TestBola {
    public static void main(String[] args) {
        Bola b1 = new Bola();
        Bola b2 = new Bola();

        System.out.println("KEADAAN AWAL");
        b1.setJari(4);
        b1.setJenis("bola pimpong");
        b1.infoBola();
        System.out.println();
        b2.setJari(10);
        b2.setJenis("Basket");
        b2.infoBola();
    }
    
}
