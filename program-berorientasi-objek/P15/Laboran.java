package P15;
import javax.swing.JOptionPane;

public class Laboran extends Staff {
    private String namaLab;

    public Laboran(){
        JOptionPane.showMessageDialog(null, "LABORAN");
        namaLab = null;
    }

    // print data
    public void infoLaboran(){
        System.out.println("NIP : " + super.getNip() + "\nNama : " + super.getNama() 
            + "\nTanggal Masuk : " + super.getTglMasuk() + "\nNama Lab : " + namaLab 
            + "\nLama Bekerja : " + super.masaKerja() + " tahun (pada tahun ini)");
    }

    // input data
    public String getData(){
        super.dataStaff();
        namaLab = JOptionPane.showInputDialog("Nama Lab : ");
        return null;
    }
    
}
