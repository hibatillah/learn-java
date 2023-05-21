package polimorfisme_tugas;

public class Lingkaran extends BangunDatar {
    public double jari;
    public double luas, keliling;
    public double pi = 3.14;

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
