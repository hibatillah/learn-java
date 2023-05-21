package Praktikum_PBO_3;

public class MobilLagi {
    private String warna;
    private String merek;

    public MobilLagi(){
        this.warna = null;
        this.merek = null;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    void beriWarna(){
        System.out.println("Warna mobil ini adalah "+getWarna());
        System.out.println("Merek mobil ini adalah "+getMerek());
    }
    
}
