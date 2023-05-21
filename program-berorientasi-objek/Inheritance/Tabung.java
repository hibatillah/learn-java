package Inheritance;

public class Tabung extends BangunRuang{
    String nama;
    double phi, jarijari, tinggi, luas, volume;
    
    public Tabung(String nama, double phi, double jarijari, double tinggi){
        this.nama = nama;
        this.phi = phi;
        this.jarijari = jarijari;
        this.tinggi = tinggi;
    }
    public Tabung(){
        phi = jarijari = tinggi = 0;
    }
    
    @Override
    public double Luas(){
        super.Luas();
        luas = 2 * phi * jarijari * (jarijari + tinggi);
        return luas;
    }
    
    @Override
    public double Volume(){
        super.Volume();
        volume = phi * jarijari * jarijari * tinggi;
        return volume;
    }       
}
