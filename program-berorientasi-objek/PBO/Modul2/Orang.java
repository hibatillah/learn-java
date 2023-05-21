package PBO.Modul2;

public class Orang {
    String nama, alamat;
    int umur;

    public Orang(){

    }

    public Orang(String nama, String alamat, int umur){
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
    }

    public void info(){
        System.out.println("Nama: "+nama);
        System.out.println("Alamat: "+alamat);
        System.out.println("Umur: "+umur);
    }
    
}
