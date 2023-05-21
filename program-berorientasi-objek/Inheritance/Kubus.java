package Inheritance;

public class Kubus extends BangunRuang{
    String nama;
    double sisi, luas, volume;
    
    public Kubus(String nama, double sisi){
        this.nama = nama;
        this.sisi =  sisi;
    }

    public Kubus(){
        sisi = 0;
    }
    
    @Override
    public double Luas(){
        super.Luas();
        luas = Math.pow(sisi, 3);
        return luas;
    }
    
    @Override
    public double Volume(){
        super.Volume();
        volume = Math.pow(sisi, 2) * 6;
        return volume;
    }       
}
