package PBO.Latihan;


public class Buku{
    String judul, penerbit, Diskon;
    int tahun, stok, jumlahbeli;
    double harga, diskonBuku, diskon, totalBuku, totalAkhir;
    
    Buku(String judul, String penerbit, int tahun, double harga, int stok){
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahun = tahun;
        this.harga = harga;
        this.stok = stok;
    }
    
    Buku(){

    }
    
    // info buku
    public void infoBuku(){
        System.out.println("Judul Buku\t\t: "+judul
            +"\nPenerbit Buku\t\t: "+penerbit
            +"\nTahun terbit\t\t: "+tahun
            +"\nHarga Buku\t\t: "+harga
            +"\nJumlah Buku stok\t: "+stok);
    }
    
    // jumlah beli buku
    public void jumlahBeli(int jumlahbeli){
        this.jumlahbeli = jumlahbeli;
        System.out.println("Jumlah Buku dibeli\t: "+jumlahbeli);
    }
    
    // harga total perbuku
    public void hargaBuku(){
        totalBuku = jumlahbeli * diskonBuku;
        System.out.println("Harga total buku\t: "+totalBuku);
    }

    // harga diskon perbuku
    public void diskonBuku(){
        if (harga>100000){
            diskon = harga * 0.07;
        } else {
            diskon = harga * 0.03;
        }
        diskonBuku = harga - diskon;
        System.out.println("Harga diskon buku\t: "+diskonBuku);
    }
    
    // harga akhir seluruh buku
    public double hargaAkhir(double total){
        if (total > 500000){
            diskon = total * 0.1;
            Diskon = "10%";
        } else {
            diskon = 0;
            Diskon = "-";
        }
        totalAkhir = total - diskon;
        return totalAkhir;
    }

}