package UTS;
class AkunBank{
    String namaBank, namaNasabah, noRek;
    int noID, transaksiDebit, transaksiKredit;
    double saldo, debit, kredit, bunga, pajak;

    AkunBank(String namaBank, String namaNasabah, String noRek, int noID, double saldo){
        this.namaBank = namaBank;
        this.namaNasabah = namaNasabah;
        this.noRek = noRek;
        this.noID = noID;
        this.saldo = saldo;
        debit = kredit = bunga = pajak = transaksiDebit =transaksiKredit = 0;
    }
    
    void dataNasabah(){
        System.out.println("Identitas Nasabah : \nNo ID\t\t: " + noID + "\nNo Rek Nasabah\t: " 
            + noRek + "\nNama Bank\t: " + namaBank + "\nNama Nasabah\t: " + namaNasabah
            + "\nJumlah Saldo\t: Rp" + saldo);
    }
    
    //print info debit & kredit
    void infoDebitKredit(){
        System.out.println("Saldo setelah penyetoran: \n" + namaNasabah + " melakukan transaksi ke "
            + transaksiDebit + "\nSaldo " + namaNasabah + " : Rp" + Debit()
            + "\nSaldo setelah penarikan: \n" + namaNasabah + "melakukan transaksi ke "
            + transaksiKredit + "\nSaldo " + namaNasabah + " : Rp" + Kredit());
    }
    
    //input jumlah debit
    public void setDebit(double debit) {
        this.debit += debit;
        transaksiDebit += 1;
    }

    //input jumlah kredit
    public void setKredit(double kredit) {
        this.kredit += kredit;
        transaksiKredit += 1;
    }

    //print bunga & pajak
    void infoBungaPajak(){
        System.out.println("Saldo setelah penambahan bunga : \nSaldo " + namaNasabah
            + " : Rp" + Bunga() + "\nSaldo setelah pengurangan pajak : \nSaldo " 
            + namaNasabah + " : Rp" + Pajak());
    }

    // menghitung debit
    double Debit(){
        saldo += debit;
        return saldo;
    }

    // menghitung kredit
    double Kredit(){
        saldo -= kredit;
        return saldo;
    }

    //menghitung bunga
    double Bunga(){
        if (saldo>10000000){
            bunga = 0.02 * saldo;
        }
        else if (saldo<10000000){
            bunga = 0.005 * saldo;
        }
        return saldo += bunga;
    }

    // menghitung pajak
    double Pajak(){
        if (saldo>10000000){
            pajak = 0.01 * saldo;
        }
        else if (saldo<10000000){
            pajak = 0.0005 * saldo;
        }
        return saldo -= pajak;
    }

}