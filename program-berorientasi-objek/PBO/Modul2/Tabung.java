package PBO.Modul2;

public class Tabung{
    double jari;
    double tinggi;
    double volume;
    double luaspermukaan;
    final double pi = 3.14;

    Tabung(){
        System.out.println("Rumus volume tabung = pi x r^2 x tinggi");
    }

    Tabung(double jari_jari, double tinggitabung){
        jari = jari_jari;
        tinggi = tinggitabung;
    }

    Tabung(Tabung a){
        System.out.println("Rumus luas permukan tabung = 2 x pi x jari x (tinggi+jari)");
    }
    
    public double volumeTabung(){
        volume = pi * jari* jari * tinggi;
        return volume;
    }
    
    public double luaspermukaanTabung(){
        luaspermukaan = 2 * pi * jari * (tinggi+jari);
        return luaspermukaan;
    }

}