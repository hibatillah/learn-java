package PBO.Modul2;

public class Lingkaran {
    double jari_jari;
    final double pi = 3.14;
    double luas;
    double kel;
    
    double luasLingkaran(){
        luas = 2*pi*jari_jari;
        return luas;
    }
    
    double kelilingLingkaran(){
        kel = pi*jari_jari*jari_jari;
        return kel;
    }
    
    void status(){
        System.out.println("Program selesai...");
    }
    
}
