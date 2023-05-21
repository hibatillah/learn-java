package Praktikum_PBO_3;

public class Mobil {
    String warna;
    String merek;

    public Mobil(){
        this.warna = "";
        this.merek = "";
    }

    public void setMerek(String merek){
        this.merek = merek;
    }

    void beriWarna(){
        System.out.println("Warna mobil ini adalah "+warna);
    }
    
    void beriMerek(){
        System.out.println("Merek mobil ini adalah "+merek);
    }
    
}
