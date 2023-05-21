package Inheritance;

public class Bola extends BangunRuang {
    String nama;
    double phi, jarijari, luas, volume;
    
    public Bola(String nama, double phi, double jarijari){
        this.nama = nama;
        this.phi = phi;
        this.jarijari = jarijari;
    }
    public Bola(){
        phi = jarijari = 0;
    }
    
    @Override
    public double Luas(){
        super.Luas();
        luas = 4 * phi * jarijari * jarijari;
        return luas;
    }
    
    @Override
    public double Volume(){
        super.Volume();
        volume = 1.3 * phi * jarijari * jarijari * jarijari;
        return volume;
    }       
    
}
