package P15;
import javax.swing.JOptionPane;

public class Dosen extends Staff{
    private String prodi, kelasWali;

    public Dosen(){
        JOptionPane.showMessageDialog(null, "DOSEN");
        prodi = kelasWali = null;
    }
    
    // print data
    public void infoDosen(){
        System.out.println("NIP : " + super.getNip() + "\nNama : " + super.getNama() 
            + "\nTanggal Masuk : " + super.getTglMasuk() + "\nProdi : " + prodi 
            + "\nLama Bekerja : " + super.masaKerja() + " tahun (pada tahun ini)"
            + "\nDosen Wali : " + kelasWali);
    }

    // input data
    public String getData(){
        super.dataStaff();
        prodi = JOptionPane.showInputDialog("Prodi : ");
        kelasWali = JOptionPane.showInputDialog("Kelas Wali : ");
        return null;
    }
}
