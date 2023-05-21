package Inheritance;


public class Trapesium extends BangunDatar{
    double sisiPanjang, sisiPendek, sisiKanan, sisiKiri, tinggi, luas, keliling;

    public Trapesium(double sisiPanjang, double sisiPendek, double sisiKanan, double sisiKiri, double tinggi){
        this.sisiPanjang = sisiPanjang;
        this.sisiPendek = sisiPendek;
        this.sisiKanan = sisiKanan;
        this.sisiKiri = sisiKiri;
        this.tinggi = tinggi;
    }

    // luas trapesium
    @Override
    public double luas(){
        super.luas();
        luas = ((sisiPanjang + sisiPendek)/2)* tinggi;
        return luas;
    }

    // keliling trapesium
    @Override
    public double keliling(){
        super.keliling();
        keliling = sisiPanjang + sisiPendek + sisiKanan + sisiKiri;
        return keliling;
    }
    
}
