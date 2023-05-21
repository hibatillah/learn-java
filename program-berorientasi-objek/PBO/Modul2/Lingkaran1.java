package PBO.Modul2;

public class Lingkaran1 {
    double jari_jari;
    final double pi = 3.14;

    Lingkaran1(double r){
        jari_jari = r;
    }

    double luasLingkaran(){
        double luas = 2*pi*jari_jari;
        return luas;
    }
    
    double kelilingLingkaran(){
        double kel = pi*jari_jari*jari_jari;
        return kel;
    }
}
