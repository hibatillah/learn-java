package Praktikum_PBO_3;

public class Buku {
    String judul, penerbit;
    int tahun, tersedia, jumlahbeli;
    double harga, diskonBuku, diskon, totalBuku, totalAkhir;
    
    Buku(String judul, String penerbit, int tahun, double harga, int tersedia){
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahun = tahun;
        this.harga = harga;
        this.tersedia = tersedia;
    }
    
    
    public void diskonBuku(){
        if (harga>100000){
            diskon = harga * 0.07;
        } else {
            diskon = harga * 0.03;
        }
        diskonBuku = harga - diskon;
        System.out.println("Harga Buku didiskon\t: "+diskonBuku);
    }
    
    public void hargaAkhirBuku(){
        if (jumlahbeli <= tersedia){
            totalBuku = diskonBuku * jumlahbeli;
            if (totalBuku>500000){
                diskon = totalBuku * 0.1;
            } else {
                diskon = 0;
            }
            totalBuku -= diskon;
            System.out.println("Total harga buku\t: "+totalBuku);
        } 
        else {
            System.out.println("'Stok buku yang tersisa hanya "+tersedia+"'");
        }
    }

    public void beliBuku(int jumlah){
        jumlahbeli = jumlah;
    }
    
    public void infoBuku(){
        System.out.println("Judul Buku\t\t: "+judul+"\nPenerbit Buku\t\t: "+penerbit
            +"\nTahun terbit\t\t: "+tahun+"\nJumlah Buku tersedia\t: "+tersedia
            +"\nJumlah Buku dibeli\t: "+jumlahbeli+"\nHarga Buku\t\t: "+harga);
    }

    public static void main(String[] args) {
        Buku book1 = new Buku("Fisika","Erlangga",2021,135500, 7);
        Buku book2 = new Buku("Matematika","Tiga Serangkai",2020,92500, 10);
        Buku book3 = new Buku("Geografi","Yudhistira",2022,112700, 12);
        
        book1.beliBuku(5);
        book1.infoBuku();
        book1.diskonBuku();
        book1.hargaAkhirBuku();
        System.out.println();
        
        book2.beliBuku(3);
        book2.infoBuku();
        book2.diskonBuku();
        book2.hargaAkhirBuku();
        System.out.println();
        
        book3.beliBuku(2);
        book3.infoBuku();
        book3.diskonBuku();
        book3.hargaAkhirBuku();
        System.out.println();

    }
    
}
