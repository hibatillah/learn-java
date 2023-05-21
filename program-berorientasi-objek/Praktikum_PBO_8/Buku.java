package Praktikum_PBO_8;

public class Buku extends AbsBuku{
    private String judul, penulis, jenisBuku;
    private int jumlahHalaman;

    Buku(String judul, String penulis, int jumlahHalaman){
        this.judul = judul;
        this.penulis = penulis;
        this.jumlahHalaman = jumlahHalaman;
        jenisBuku = null;
    }

    @Override  
    public String infoBuku(){
        System.out.println("Buku ini berjudul " + judul + " oleh penulis " 
            + penulis + ", dengan " + jumlahHalaman + " halaman.");
        return null;
    }

    @Override   //menentukan jenis buku
    public void jenisBuku(String jenisBuku){
        this.jenisBuku = jenisBuku;
        if (jenisBuku.equalsIgnoreCase("pelajaran")) {
            System.out.println("Buku ini berisi tentang materi pelajaran.");
        }
        else if (jenisBuku.equalsIgnoreCase("ensiklopedia")) {
            System.out.println("Buku ini berisi informasi umum yang perlu kita ketahui");
        }
        else if (jenisBuku.equalsIgnoreCase("novel")) {
            System.out.println("Buku ini berisi cerita hiburan bagi pembacanya");
        }
    }
    
}
