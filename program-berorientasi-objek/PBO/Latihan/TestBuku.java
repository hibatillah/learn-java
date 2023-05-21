package PBO.Latihan;

public class TestBuku {
    public static void main(String[] args) {
        Buku book1 = new Buku("Fisika","Erlangga",2021,135500, 15);
        Buku book2 = new Buku("Matematika","Tiga Serangkai",2020,92500, 10);
        Buku book3 = new Buku("Geografi","Yudhistira",2022,112700, 12);
        Buku book = new Buku();
        
        book1.infoBuku();
        book1.diskonBuku();
        book1.jumlahBeli(5);
        book1.hargaBuku();
        System.out.println();
        
        book2.infoBuku();
        book2.diskonBuku();
        book2.jumlahBeli(7);
        book2.hargaBuku();
        System.out.println();
        
        book3.infoBuku();
        book3.diskonBuku();
        book3.jumlahBeli(3);
        book3.hargaBuku();
        System.out.println();
        
        double total, totalAkhir;
        total = book1.totalBuku + book2.totalBuku + book3.totalBuku;
        totalAkhir = book.hargaAkhir(total);
        
        System.out.println("------"
            +"\nTotal seluruh buku\t: "+total
            +"\nDiskon Buku\t\t: "+book.Diskon
            +"\nTotal harga akhir\t: "+totalAkhir);
    }
    
}
