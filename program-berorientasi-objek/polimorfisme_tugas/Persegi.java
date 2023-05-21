package polimorfisme_tugas;

public class Persegi extends BangunDatar {
    public double sisi;
    public double luas, keliling;

    public Persegi(double sisi){
        this.sisi = sisi;
    }

    // luas persegi
    @Override
    public double luas(){
        super.luas();
        luas = sisi*sisi;
        return luas;
    }

    // keliling persegi
    @Override
    public double keliling(){
        super.keliling();
        keliling = sisi*4;
        return keliling;
    }
    
}
