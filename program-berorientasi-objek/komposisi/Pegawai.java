package komposisi;
import javax.swing.JOptionPane;

public class Pegawai {
    private String nama, alamat, jabatan;
    
    public void setData(){
        nama = JOptionPane.showInputDialog("Nama : ");
        alamat = JOptionPane.showInputDialog("Alamat : ");
        jabatan = JOptionPane.showInputDialog("Jabatan : ");
    }
    
    public void getData(){
        System.out.println(nama + "\t" + jabatan + "\t\t" + alamat);
    }

}
