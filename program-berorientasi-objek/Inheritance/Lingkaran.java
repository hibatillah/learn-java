package Inheritance;

public class Lingkaran extends BangunDatar {
    double jari, luas, keliling;
    double pi = 3.14;

    public Lingkaran(double jari){
        this.jari = jari;
    }

    // luas lingkarang
    @Override
    public double luas(){
        super.luas();
        luas = pi*jari*jari;
        return luas;
    }

    // keliling lingkaran
    @Override
    public double keliling(){
        super.keliling();
        keliling = 2*pi*jari;
        return keliling;
    }
    
}
