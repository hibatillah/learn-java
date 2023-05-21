package Praktikum_PBO_3;

public class Bola {
    private double jari;
    private String jenis;
    public final double pi = 3.14;

    public Bola(){
        jari = 0;
        jenis = null;
    }

    public double getJari() {
        return jari;
    }
    public void setJari(double jari) {
        this.jari = jari;
    }
    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double volumeBola(){
        double volume = (4/3)*pi*jari*jari*jari;
        return volume;
    }

    public void infoBola(){
        System.out.println("Jari-jari : "+jari
            +"\nJenis bola : "+jenis
            +"\nVolume bola : "+volumeBola());
    }
    
}
