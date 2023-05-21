package P15;
import javax.swing.JOptionPane;

public class PegawaiKontrak extends Pegawai{
    private int noPeg, masaKontrak, uangMakan, kehadiran, gajiPokok, gajiBersih;
    private String nama;

    public PegawaiKontrak(){
        JOptionPane.showMessageDialog(null, "Pegawai Kontrak");
        noPeg = masaKontrak = kehadiran = uangMakan = 0;
        nama = null;
        gajiPokok = 500000;
    }

    // input data
    public String getData(){
        noPeg = Integer.parseInt(JOptionPane.showInputDialog("No Pegawai : "));
        nama = JOptionPane.showInputDialog("Nama : ");
        kehadiran = Integer.parseInt(JOptionPane.showInputDialog("Kehadiran : "));
        masaKontrak = Integer.parseInt(JOptionPane.showInputDialog("Masa Kontrak : "));
        return null;
    }

    // print data
    @Override
    public void lihatData(){
        System.out.println("=== PEGAWAI KONTRAK ==="
            + "\nNo Pegawai : " +noPeg + "\nNama : " + nama
            + "\nMasa Kontrak : " + masaKontrak + " bulan" + "\nKehadiran : " + kehadiran + " hari"
            + "\nUang Makan : Rp" + UangMakan() + "\nGaji pokok : Rp" + gajiPokok 
            + "\nGaji bersih : Rp" + hitungGaji());
    }
    
    // hitung uang makan
    public int UangMakan(){
        uangMakan = 20000 * kehadiran;
        return uangMakan;
    }

    @Override
    public int hitungGaji(){
        gajiBersih = UangMakan() + gajiPokok;
        return gajiBersih;
    }
}
    
