package UTS;

public class TestKartuKredit {
    public static void main(String[] args) {
        kartuKredit CC = new kartuKredit(1, "000124587634", "Mandiri", "Roni", 1500000);

        CC.dataNasabah();
        System.out.println();

        CC.setTransaksi(500000);    //jumlah transaksi yg dilakukan
        CC.limitTransaksi();    //sisa limit setelah transaksi
        System.out.println();

        CC.setCicilan(300000);  //jumlah cicilan yang dibayarkan
        CC.limitCicilan();  //limit setelah bayar cicilan
        System.out.println();

        CC.setJumlahBulan(6);   //jumlah bulan dalam membayar cicilan
        CC.infoCicilan();   //jumlah limit selama masih mengangsur cicilan
        System.out.println();
        
    }
    
}
