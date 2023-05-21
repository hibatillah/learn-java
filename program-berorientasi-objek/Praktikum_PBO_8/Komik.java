package Praktikum_PBO_8;

public class Komik implements Tulisan {
    private String judul, penulis;

    public Komik(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }    

    @Override
    public void info(){
        System.out.println("Komik berjudul " + judul + " oleh penulis " + penulis);
    }

    @Override
    public void jenis(){
        System.out.println("Komik adalah buku cerita yang berisi tulisan dan gambar"
            + " serta tambahan elemen lain untuk menarik minat pembacanya");
    }
}
