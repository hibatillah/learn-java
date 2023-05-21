package Another_Praktikum_PBO_3;

public class LingkaranLagi {
    private double jari_jari;
    private final double pi = 3.14;

    public LingkaranLagi(){
        jari_jari = 0;
    }

    public double getJari_jari() {
        return jari_jari;
    }

    public void setJari_jari(double jari_jari) {
        this.jari_jari = jari_jari;
    }

    public double luasLingkaran(){
        double luas = 2*pi*jari_jari;
        return luas;
    }

    public double kelLingkaran(){
        double kel = pi*jari_jari*jari_jari;
        return kel;
    }
    
}
