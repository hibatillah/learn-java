package Praktikum_PBO_8;

public class BukuTulisan implements Tulisan {
    private String judul, penulis;

    public BukuTulisan(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }    

    @Override
    public void info(){
        System.out.println("Buku berjudul " + judul + " oleh penulis " + penulis);
    }

    @Override
    public void jenis(){
        System.out.println("Buku merupakan kumpulan tulisan tentang berbagai hal");
    }
}
