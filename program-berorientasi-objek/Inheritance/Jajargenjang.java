package Inheritance;

public class Jajargenjang extends BangunDatar{
    double alas, tinggi, panjang, lebar, luas, keliling;

    public Jajargenjang(double alas, double tinggi, double panjang, double lebar){
        this.alas = alas;
        this.tinggi = tinggi;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // luas jajargenjang
    @Override
    public double luas(){
        super.luas();
        luas = alas * tinggi;
        return luas;
    }

    // keliling jajargenjang
    @Override
    public double keliling(){
        super.keliling();
        keliling = 2*(panjang*lebar);
        return keliling;
    }
    
}
