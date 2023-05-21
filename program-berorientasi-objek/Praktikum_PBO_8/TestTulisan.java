package Praktikum_PBO_8;

public class TestTulisan {
    public static void main(String[] args) {
        BukuTulisan B = new BukuTulisan("Pergi", "Tere liye");
        Lukisan L = new Lukisan("Monalisa", "Leonardo Da Vinci");
        Komik K = new Komik("Doraemon", "Yasue T. Tajima");

        B.info();
        B.jenis();
        System.out.println();
        
        L.info();
        L.jenis();
        System.out.println();
        
        K.info();
        K.jenis();
        System.out.println();
    }  
}
