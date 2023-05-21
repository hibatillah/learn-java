package P15;
import javax.swing.JOptionPane;

public class Staff {
    private String nip, nama, tglMasuk;
    private int tahunSekarang, tahunMasuk, tanggalMasuk, lamaKerja;
    private String bulanMasuk;

    public Staff(){
        tahunSekarang = 2022;
    }

    // get data staff
    public String dataStaff(){
        nip = JOptionPane.showInputDialog("NIP : ");
        nama = JOptionPane.showInputDialog("Nama : ");
        JOptionPane.showMessageDialog(null, "Tanggal Masuk");
        tanggalMasuk = Integer.parseInt(JOptionPane.showInputDialog("Tanggal : "));
        bulanMasuk = JOptionPane.showInputDialog("Bulan : ");
        tahunMasuk = Integer.parseInt(JOptionPane.showInputDialog("Tahun : "));
        setTglMasuk(tanggalMasuk, bulanMasuk, tahunMasuk);
        setNama(nama);
        setNip(nip);
        return null;
    }

     // hitung masa kerja
    public int masaKerja(){
        lamaKerja = tahunSekarang - tahunMasuk;
        return lamaKerja;
    }
    
    public String getTglMasuk() {
        return tglMasuk;
    }
    public void setTglMasuk(int tanggalMasuk, String bulanMasuk, int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
        tglMasuk = tanggalMasuk + " " + bulanMasuk + " " + tahunMasuk;
    }

    public String getNip() {
        return nip;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
}
