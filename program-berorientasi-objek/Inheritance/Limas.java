package Inheritance;

public class Limas extends BangunRuang {
    String nama;
    double sisi, alas, tinggi, tinggiLimas, luasAlas, sisiTegak, volume;
    
    public Limas(String nama, double sisi, double alas, double tinggi, double tinggiLimas){
        this.nama = nama;
        this.sisi =  sisi;
        this.alas = alas;
        this.tinggi = tinggi;
        this.tinggiLimas = tinggiLimas;
    }
    public Limas(){
        sisi = alas = tinggi = tinggiLimas = 0;
    }
    
    public double luasAlas(){
        luasAlas = sisi * sisi;
        return luasAlas;
    }
    public double luasSisiTegak(){
        sisiTegak= (alas * tinggi) / 2;
        return 4 * sisiTegak;
    }
    @Override
    public double Luas(){
        super.Luas();
        return luasAlas() + luasSisiTegak();
    }
    
    @Override
    public double Volume(){
        super.Volume();
        volume = 0.3 * luasAlas() * tinggi;
        return volume;
    }        
}
