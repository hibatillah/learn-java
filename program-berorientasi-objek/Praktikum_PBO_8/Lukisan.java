package Praktikum_PBO_8;

public class Lukisan implements Tulisan{
    private String judul, karya;

    public Lukisan(String judul, String karya){
        this.judul = judul;
        this.karya = karya;
    }    

    @Override
    public void info(){
        System.out.println("Lukisan berjudul " + judul + " karya " + karya);
    }

    @Override
    public void jenis(){
        System.out.println("Lukisan adalah sebuah gambar");
    }
}
