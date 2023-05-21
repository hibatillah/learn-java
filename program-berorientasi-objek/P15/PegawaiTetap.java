package P15;
import javax.swing.JOptionPane;

public class PegawaiTetap extends Pegawai{
    private int noPeg, uangMakan, kehadiran, tunjangan, gajiPokok, gajiBersih;
    private String nama;

    public PegawaiTetap(){
        JOptionPane.showMessageDialog(null, "Pegawai Tetap");
        noPeg = kehadiran = uangMakan = 0;
        nama = null;
        gajiPokok = tunjangan = 500000;
    }

    // input data
    public String getData(){
        noPeg = Integer.parseInt(JOptionPane.showInputDialog("No Pegawai : "));
        nama = JOptionPane.showInputDialog("Nama : ");
        kehadiran = Integer.parseInt(JOptionPane.showInputDialog("Kehadiran : "));
        return null;
    }

    // print data
    @Override
    public void lihatData(){
        System.out.println("=== PEGAWAI TETAP ==="
            + "\nNo Pegawai : " +noPeg + "\nNama : " + nama
            + "\nKehadiran : " + kehadiran + " hari" + "\nUang Makan : Rp" + UangMakan() 
            + "\nGaji pokok : Rp" + gajiPokok + "\nTunjangan : Rp" + tunjangan 
            +  "\nGaji bersih : Rp" + hitungGaji());
    }
    
    // hitung uang makan
    public int UangMakan(){
        uangMakan = 20000 * kehadiran;
        return uangMakan;
    }

    @Override
    public int hitungGaji(){
        gajiBersih = tunjangan + UangMakan() + gajiPokok;
        return gajiBersih;
    }
}
