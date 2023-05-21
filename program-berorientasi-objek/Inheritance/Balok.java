package Inheritance;

public class Balok extends BangunRuang {
    String nama;
    double panjang, lebar, tinggi, luas, volume;
    
    public Balok(String nama, double panjang, double lebar, double tinggi){
        this.nama = nama;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public Balok(){
        panjang = lebar = tinggi = 0;
    }
    
    @Override
    public double Luas(){
        super.Luas();
        luas = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        return luas;
    }
    
    @Override
    public double Volume(){
        super.Volume();
        volume = panjang * lebar * tinggi;
        return volume;
    }       
    
}
