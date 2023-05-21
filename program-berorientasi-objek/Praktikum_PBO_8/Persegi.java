package Praktikum_PBO_8;

public class Persegi implements BangunDatar{
    private double sisi;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas(){
        return 4 * sisi;
    }

    @Override
    public double hitungKelililng(){
        return sisi * sisi;
    }
    
}
