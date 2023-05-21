package polimorfisme_tugas;

public class Segitiga extends BangunDatar {
    public double alas, tinggi;
    public double sisi, luas, keliling;

    public Segitiga(double alas, double tinggi, double sisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    public Segitiga(){
        alas = tinggi = sisi = 0;
    }

    //luas segitiga
    @Override   
    public double luas(){
        super.luas();
        luas = 0.5*alas*tinggi;
        return luas;
    }

    // keliling segitiga
    @Override
    public double keliling(){
        super.keliling();
        keliling = sisi * 3; //dengan anggapan segitiga sama sisi
        return keliling;
    }
    
}
