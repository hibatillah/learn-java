package Praktikum_PBO_3;

public class Bank {
    private String nama, noRek, password;
    private double saldo;
    public double debit, kredit;

    public Bank(){
        
    }
    
    public Bank(String nama, String noRek, String password, double saldo) {
        this.nama = nama;
        this.noRek = noRek;
        this.password = password;
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoRek() {
        return noRek;
    }
    public void setNoRek(String noRek) {
        this.noRek = noRek;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double Debit(double debit){
        this.debit = debit;
        saldo += debit;
        return saldo;
    }

    public double Kredit(double kredit){
        this.kredit = kredit;
        saldo -= kredit;
        return saldo;
    }

    public void infoNasabah(){
        System.out.println("Nasabah Bank ABC"
            +"\nNama\t\t: "+nama
            +"\nNo Rekening\t: "+noRek
            +"\nSaldo\t\t: "+saldo);
    }

}
