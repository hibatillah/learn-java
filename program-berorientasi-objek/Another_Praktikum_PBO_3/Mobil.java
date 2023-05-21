package Another_Praktikum_PBO_3;

public class Mobil {
    protected String warna;
    protected String merek;

    protected Mobil(){
        warna = "";
        merek = "";
    }

    protected void beriWarna(){
        System.out.println("Warna mobil ini adalah "+warna);
    }

    protected void beriMerek(){
        System.out.println("Merek mobil ini adalah "+merek);
    }
    
}
