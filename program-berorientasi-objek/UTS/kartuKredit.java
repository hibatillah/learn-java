package UTS;

public class kartuKredit {
    String noKartuKredit, namaBank, namaNasabah;
    double jumlahLimit, transaksi, cicilan, splitBulanan, splitBulananBunga, bunga;
    int noID, jumlahTransaksi, jumlahTransaksiCicilan, jumlahBulan;

    kartuKredit(int noID, String noKartuKredit, String namaBank, String namaNasabah, double jumlahLimit){
        this.noID = noID;
        this.noKartuKredit = noKartuKredit;
        this.namaBank = namaBank;
        this.namaNasabah = namaNasabah;
        this.jumlahLimit = jumlahLimit;
        transaksi = cicilan = bunga = jumlahTransaksi = jumlahTransaksiCicilan = jumlahBulan = 0;
    }

    //info nasabah
    void dataNasabah(){
        System.out.println("Identitas Nasabah : \nNo ID : " + noID + "\nNo Kartu Kredit : " + noKartuKredit 
            + "\nNama Bank : " + namaBank + "\nNama Nasabah : " + namaNasabah + "\nJumlah Limit : Rp" + jumlahLimit);
    }

    //pengurangan limit setelah transaksi
    void limitTransaksi(){
        System.out.println("Limit setelah transaksi : \n" + namaNasabah + " melakukan transaksi ke "
            + jumlahTransaksi + "\nLimit " + namaNasabah + " : Rp" + Transaksi());
    }

    //penambahan limit kembali setelah bayar cicilan
    void limitCicilan(){
        System.out.println("Limit setelah pembayaran cicilan : \n" + namaNasabah + " melakukan transaksi ke "
            + jumlahTransaksiCicilan + "\nLimit " + namaNasabah + " : Rp" + Cicilan());
    }

    //info limit dengan split cicilan bulan tertentu
    void infoCicilan(){
        if (jumlahBulan==3 || jumlahBulan==6 || jumlahBulan==9){
            System.out.println("Limit ketika split cicilan " + jumlahBulan + " bulan"
                + "\nLimit " + namaNasabah + " : Rp" + splitCicilan());

            if (jumlahBulan==6 || jumlahBulan==9){
                System.out.println("\nLimit setelah bunga cicilan " + jumlahBulan + " bulan"
                    + "\nLimit " + namaNasabah + " : Rp" + splitCicilanBunga());
            }
        } 
    }
    
    //melakukan transaksi
    double Transaksi(){
        return jumlahLimit -= transaksi;
    }

    //membayar cicilan
    double Cicilan(){
        return jumlahLimit += cicilan;
    }

    //split cicilan bulanan
    double splitCicilan(){
        switch (jumlahBulan){
            case 3 :
                splitBulanan = transaksi / 3;
                break;
            case 6 :
                splitBulanan = transaksi / 6;
                break;
            case 9 :
                splitBulanan = transaksi / 9;
                break;
            default:
                splitBulanan = 0;
        }
        return jumlahLimit -= splitBulanan;
    }

    //split cicilan bulanan dengan bunga
    double splitCicilanBunga(){
        switch (jumlahBulan){
            case 6 :
                bunga = transaksi * 0.01;
                splitBulananBunga = transaksi / 6 + bunga;
                break;
            case 9 :
                bunga = transaksi * 0.02;
                splitBulananBunga = transaksi / 9 + bunga;
                break;
            default:
                splitBulananBunga = 0;
        }
        return jumlahLimit -= splitBulananBunga;
    }

    //input jumlah transaksi
    public void setTransaksi(double transaksi) {
        this.transaksi += transaksi;
        jumlahTransaksi += 1;
    }

    //input jumlah cicilan yang sudah dibayarkan
    public void setCicilan(double cicilan) {
        this.cicilan += cicilan;
        jumlahTransaksiCicilan += 1;
    }

    //input jumlah bulan untuk membayar cicilan
    public void setJumlahBulan(int jumlahBulan) {
        this.jumlahBulan = jumlahBulan;
    }

}
